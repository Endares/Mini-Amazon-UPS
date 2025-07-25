package org.example.world;

import java.net.Socket;
import java.security.MessageDigest;

import org.hibernate.Session;
import org.example.proto.WorldUps.*;
import org.example.common.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.example.utils.MessageHandler;
import org.slf4j.LoggerFactory;

import org.example.utils.PrintHelper;

import java.util.ArrayList;
import java.util.List;
import org.example.utils.*;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.example.common.*;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.proto.*;
import org.example.utils.*;
// import org.example.proto.UpsAmazon.ABookTruck;
// import org.example.proto.UpsAmazon.AUCommunication;
import org.example.utils.HibernateUtil;
import org.example.utils.MessageHandler;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class WorldReceiver implements Runnable {
    private Socket worldSocket;
    private SessionFactory sessionFactory;
    private MessageHandler messageHandler;
    private final Logger logger;
    

    public WorldReceiver(Socket socket, SessionFactory sessionFactory, MessageHandler messageHandler, Logger logger) {
        this.worldSocket = socket;
        this.sessionFactory = sessionFactory;
        this.messageHandler = messageHandler;
        this.logger = logger;
        logger.info("WorldReceiver initialized with socket: {}", socket.getPort());
    }

    public void run() {
        Session session = sessionFactory.openSession();
        logger.info("Starting World Receiver loop");
        while (true) {
            try {
                logger.info("Waiting for messages from World simulator");
                UResponses uResponses = messageHandler.receiveMessage(UResponses.parser(), worldSocket);
                logger.info("Received UResponses with {} completions, {} deliveries, {} truck status, {} acks", 
                    uResponses.getCompletionsCount(), 
                    uResponses.getDeliveredCount(),
                    uResponses.getTruckstatusCount(),
                    uResponses.getAcksCount());
                
                Transaction transaction = session.beginTransaction();
                for (UFinished uFinished : uResponses.getCompletionsList()) {
                    UFinishedHelper(session, uFinished);
                }
                for (UDeliveryMade uDeliveryMade : uResponses.getDeliveredList()) {
                    // 2.1 write seq nums into acks, resendacks
                    // check whether in ack table
                    UDeliveryMadeHandler(session, uDeliveryMade);
                }
                for (UTruck uTruck : uResponses.getTruckstatusList()) {
                    UTruckHandler(session, uTruck);
                }
                resendHandler(session, uResponses);
                // PrintHelper printer = new PrintHelper();
                // printer.printAllDatabaseInfo();
                // Process the responses
                transaction.commit();
                logger.info("Transaction committed successfully");
            } catch (Exception e) {
                // Handle exceptions
                logger.error("Error in WorldReceiver: {}", e.getMessage(), e);
                break;
            }
        }
    }
    /**
     * Send Ack to World on receiving UResponse
     * @param Ack: 
     * @param ResendAck: when a sender sends URequest, it adds the seqnum into Ack,
     * on receiving an ack, it deletes this record in ResendAck and adds it into Ack.
     * Resend all records in ResendAck in the end of each UCommand.
     */
    private void ackHandler(Session session, Long seqNum) {
        logger.debug("Processing ack for seqNum: {}", seqNum);
        List<Ack> allAcks = session.createQuery("FROM Ack WHERE ack = :ack", Ack.class)
        .setParameter("ack", seqNum).getResultList();
        List<ResendAck> allResendAcks = session
                .createQuery("FROM ResendAck WHERE ack = :ack", ResendAck.class).setParameter("ack", seqNum)
                .getResultList();

        // empty => if not in resend acks table, save it
        if (allResendAcks.isEmpty()) {
            ResendAck resendAck = new ResendAck();
            resendAck.setAck(seqNum);
            session.save(resendAck);
            logger.debug("Added new ResendAck for seqNum: {}", seqNum);
        }
        // not empty => if already exists, do not handle again
        if (!allAcks.isEmpty()) {
            logger.debug("Ack already exists for seqNum: {}, skipping", seqNum);
            return;
        }

        // save seq num into acks table
        Ack ack1 = new Ack();
        ack1.setAck(seqNum);
        session.persist(ack1);
        logger.debug("Added new Ack for seqNum: {}", seqNum);
    }

    private void resendHandler(Session session, UResponses uResponses) {
        if (!uResponses.getAcksList().isEmpty()) {
            logger.info("Processing {} acks from World", uResponses.getAcksCount());
        }
        
        for(Long ack : uResponses.getAcksList()) {
            UGoPickupD pickupToDelete = session.createQuery("FROM UGoPickupD WHERE seqNum = :seqNum", UGoPickupD.class)
                    .setParameter("seqNum", ack).uniqueResult();
            if (pickupToDelete != null) {
                session.delete(pickupToDelete);
                logger.debug("Deleted UGoPickupD with seqNum: {}", ack);
            }

            // Find and delete UGoDeliver record with the same seqnumber
            UGoDeliverD deliverToDelete = session.createQuery("FROM UGoDeliverD WHERE seqNum = :seqNum", UGoDeliverD.class)
                    .setParameter("seqNum", ack).uniqueResult();
            if (deliverToDelete != null) {
                session.delete(deliverToDelete);
                logger.debug("Deleted UGoDeliverD with seqNum: {}", ack);
            }
        }
    }


    /**
     * Deal with completions:
     * You will receive this notification when either (a) a truck reaches the 
     * warehouse you sent it to (with a pickup command) and is ready to load 
     * a package or (b) a truck has finished all of itsdeliveries (that you 
     * sent it to make with a deliveries command).
     * At this point the truck may be given other instructions. Note that the 
     * completion tells you the current location of the truck.
     * @param transaction
     * @param uFinished: ONE UFinished object
     */
    private void UFinishedHelper(Session session, UFinished uFinished) {
        Long seqNum = uFinished.getSeqnum();
        logger.info("Processing UFinished for truckID: {}, status: {}", uFinished.getTruckid(), uFinished.getStatus());
        ackHandler(session, seqNum);

        int truckID = uFinished.getTruckid();
        Truck truck = session.createQuery("FROM Truck WHERE truckId = :truck_id", Truck.class).setParameter("truck_id", truckID).uniqueResult();
        
        if (truck != null) {
            logger.debug("Found truck: {} with current status: {}", truckID, truck.getStatus());
            // auto status = uFinished.getStatus();
            // if (status == "loading") truck.setStatus(TruckStatus.LOADING);
            // else truck.setStatus(TruckStatus.IDLE);
            String currentStatus = truck.getStatus();
            truck.setStatus(uFinished.getStatus().toLowerCase());
            truck.setX(uFinished.getX());
            truck.setY(uFinished.getY());
            session.persist(truck);
            logger.info("Updated truck position to ({},{}), maintained status: {}", truck.getX(), truck.getY(), currentStatus);
        } else {
            logger.warn("Truck not found with ID: {}", truckID);
        }
    }

    /**
     * You will receive this notification when each package is delivered. Note that 
     * when each package is delivered, a delivered response will be sent. When all 
     * deliveries are finished, you will receive a completions response.
     */
    private void UDeliveryMadeHandler(Session session, UDeliveryMade uDeliveryMade) {
        Long seqNum = uDeliveryMade.getSeqnum();
        Long packageID = uDeliveryMade.getPackageid();
        int truckID = uDeliveryMade.getTruckid();
        
        logger.info("Processing UDeliveryMade for package: {}, truck: {}", packageID, truckID);
        ackHandler(session, seqNum);

        // save package
        Shipment shipment = session.createQuery("FROM Shipment WHERE packageId =:package_id", Shipment.class).setParameter("package_id", packageID).uniqueResult();
        if (shipment != null) {
            String oldStatus = shipment.getStatus();
            shipment.setStatus("delivered");
            session.persist(shipment);
            logger.info("Updated package {} status from '{}' to 'delivered'", packageID, oldStatus);
        } else {
            logger.warn("Shipment not found with package ID: {}", packageID);
        }
        
        // save truck
        Truck truck = session.createQuery("FROM Truck WHERE truckId =:truck_id", Truck.class).setParameter("truck_id", truckID).uniqueResult();
        if (truck != null) {
            String oldStatus = truck.getStatus();
            truck.setStatus("delivering");
            session.persist(truck);
            logger.info("Updated truck {} status from '{}' to 'delivering'", truckID, oldStatus);
        } else {
            logger.warn("Truck not found with ID: {}", truckID);
        }
    }

    private void UTruckHandler(Session session, UTruck uTruck) {
        int truckID = uTruck.getTruckid();
        logger.debug("Processing UTruck status update for truck: {}", truckID);
        
        Truck truck = session.createQuery("FROM Truck WHERE truckId =:truck_id", Truck.class).setParameter("truck_id", truckID).uniqueResult();
        if (truck != null) {
            String currentStatus = truck.getStatus();
            truck.setX(uTruck.getX());
            truck.setY(uTruck.getY());
            // truck.setStatus(uTruck.getStatus());
            session.persist(truck);
            logger.debug("Updated truck {} position to ({},{}), maintained status: {}", 
                truckID, truck.getX(), truck.getY(), currentStatus);
            
            if (currentStatus.equals("traveling")) {
                logger.info("Truck {} is in 'traveling' status, not changing status from world update", truckID);
            }
        } else {
            logger.warn("Truck not found with ID: {}", truckID);
        }
    }
}

