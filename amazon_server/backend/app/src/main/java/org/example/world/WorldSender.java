package org.example.world;

import java.net.Socket;

import org.example.proto.WorldUps.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.stream.Collectors;
import org.example.utils.*;
import org.example.utils.PrintHelper;
import java.io.IOException;
import org.example.utils.MessageHandler;
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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class WorldSender implements Runnable {
    private Socket worldSocket;
    private SessionFactory sessionFactory;
    private MessageHandler messageHandler;
    private final Logger logger;

    public WorldSender(Socket socket, SessionFactory sessionFactory, MessageHandler messageHandler, Logger logger) {
        this.worldSocket = socket;
        this.sessionFactory = sessionFactory;
        this.messageHandler = messageHandler;
        this.logger = logger;
        logger.info("WorldSender initialized with socket: {}", socket.getPort());
    }

    public void run() {
        logger.info("Starting World Sender loop");
        while (true) {
            Session session = null;
            Transaction transaction = null;
            
            try {
                Thread.sleep(5000);
                logger.debug("WorldSender woke up, preparing commands");
                
                // 每次循环创建新的Session
                session = sessionFactory.openSession();
                
                // create new Ucommands
                UCommands.Builder uCommands = UCommands.newBuilder();

                transaction = session.beginTransaction();
                UGoPickSender(session, uCommands);
                UGoDeliverSender(session, uCommands);
                // 3. add acks from Resend table
                List<ResendAck> allResendAcks = session.createQuery("FROM ResendAck", ResendAck.class).getResultList();

                Iterable<Long> allAcks = allResendAcks.stream().map(ResendAck::getAck).collect(Collectors.toList());
                uCommands.addAllAcks(allAcks);

                // 4. send uCommands to world
                if(uCommands.getPickupsCount()<=0 && uCommands.getDeliveriesCount()<=0 && uCommands.getAcksCount()<=0 && uCommands.getQueriesCount()<=0){
                    logger.debug("No commands to send to world");
                    if (transaction != null && transaction.isActive()) {
                        transaction.commit();
                    }
                    if (session != null && session.isOpen()) {
                        session.close();
                    }
                    continue;
                }

                for (ResendAck record : allResendAcks) {
                    session.delete(record);
                    logger.debug("Deleted ResendAck with seqNum: {}", record.getAck());
                }
                
                try {
                    messageHandler.sendMessage(uCommands.build(), worldSocket);
                    logger.info("Sent UCommands to world with {} pickups, {} deliveries, {} acks", 
                                uCommands.getPickupsCount(), uCommands.getDeliveriesCount(), uCommands.getAcksCount());
                } catch (IOException e) {
                    logger.error("Failed to send UCommands to world: {}", e.getMessage());
                    throw e; // rethrow for outer handling
                }
                
                if (transaction != null && transaction.isActive()) {
                    transaction.commit();
                    logger.debug("Transaction committed");
                }
                
                // PrintHelper printer = new PrintHelper();
                // printer.printAllDatabaseInfo();
            } catch (InterruptedException e) {
                logger.error("WorldSender thread interrupted: {}", e.getMessage());
                break;
            } catch (Exception e) {
                logger.error("Error in WorldSender: {}", e.getMessage(), e);
                if (transaction != null && transaction.isActive()) {
                    try {
                        transaction.rollback();
                        logger.info("Transaction rolled back due to error");
                    } catch (Exception rollbackEx) {
                        logger.error("Error during transaction rollback: {}", rollbackEx.getMessage());
                    }
                }
            } finally {
                // 确保在循环结束时关闭Session
                if (session != null && session.isOpen()) {
                    try {
                        session.close();
                        logger.debug("Session closed");
                    } catch (Exception e) {
                        logger.error("Error closing session: {}", e.getMessage());
                    }
                }
            }
        }
        logger.info("WorldSender loop ended");
    }

    private void UGoPickSender(Session session, UCommands.Builder uCommands) {
        List<UGoPickupD> allUGoPickups = session.createQuery("FROM UGoPickupD", UGoPickupD.class).getResultList();
        
        if (!allUGoPickups.isEmpty()) {
            logger.info("Found {} UGoPickupD requests to process", allUGoPickups.size());
        }
        
        // for every record in UGoPickUp table, make it as uGoPickUp and add it to
        // uCommands
        for (UGoPickupD pickUpRequest : allUGoPickups) {
            UGoPickup.Builder uGoPickUp = UGoPickup.newBuilder();
            uGoPickUp.setTruckid(pickUpRequest.getTruckId()).setWhid(pickUpRequest.getWhId())
                    .setSeqnum(pickUpRequest.getSeqNum());
            uCommands.addPickups(uGoPickUp);
            logger.debug("Added UGoPickup command for truck: {}, warehouse: {}, seqNum: {}", 
                        pickUpRequest.getTruckId(), pickUpRequest.getWhId(), pickUpRequest.getSeqNum());

            // change status of truck to traveling
            int truckID = pickUpRequest.getTruckId();
            Truck truck = session.createQuery("FROM Truck WHERE truckId = :truck_id", Truck.class)
                    .setParameter("truck_id", truckID).uniqueResult();
            
            if (truck != null) {
                String oldStatus = truck.getStatus();
                truck.setStatus("traveling");
                session.saveOrUpdate(truck);
                logger.info("Updated truck {} status from '{}' to 'traveling'", truckID, oldStatus);
            } else {
                logger.warn("Truck not found with ID: {}", truckID);
            }
        }
    }

    private void UGoDeliverSender(Session session, UCommands.Builder uCommands) {
        List<UGoDeliverD> allUGoDelivers = session.createQuery("FROM UGoDeliverD", UGoDeliverD.class)
                    .getResultList();
        
        if (!allUGoDelivers.isEmpty()) {
            logger.info("Found {} UGoDeliverD requests to process", allUGoDelivers.size());
        }
        
        // for every record in UGoDeliver table, make it as UGoDeliver and add it to
        // uCommands
        for (UGoDeliverD deliverRequest : allUGoDelivers) {
            UGoDeliver.Builder uGoDeliver = UGoDeliver.newBuilder();
            int packageCount = 0;
            
            for (UDeliveryLocationD location : deliverRequest.getPackages()) {
                UDeliveryLocation.Builder uLocation = UDeliveryLocation.newBuilder();
                uLocation.setPackageid(location.getPackageId()).setX(location.getX()).setY(location.getY());
                uGoDeliver.addPackages(uLocation);
                packageCount++;
                
                // change status of package to delivering
                Shipment shipment = session
                        .createQuery("FROM Shipment WHERE packageId = :package_id", Shipment.class)
                        .setParameter("package_id", uLocation.getPackageid()).uniqueResult();
                
                if (shipment != null) {
                    String oldStatus = shipment.getStatus();
                    shipment.setStatus("delivering");
                    session.saveOrUpdate(shipment);
                    logger.debug("Updated package {} status from '{}' to 'delivering'", location.getPackageId(), oldStatus);
                } else {
                    logger.warn("Shipment not found with package ID: {}", location.getPackageId());
                }
            }
            
            uGoDeliver.setTruckid(deliverRequest.getTruckId()).setSeqnum(deliverRequest.getSeqNum());
            uCommands.addDeliveries(uGoDeliver);
            logger.debug("Added UGoDeliver command for truck: {}, with {} packages, seqNum: {}", 
                       deliverRequest.getTruckId(), packageCount, deliverRequest.getSeqNum());

            // change status of truck to delivering
            int truckID = deliverRequest.getTruckId();
            Truck truck = session.createQuery("FROM Truck WHERE truckId = :truck_id", Truck.class)
                    .setParameter("truck_id", truckID).uniqueResult();
            
            if (truck != null) {
                String oldStatus = truck.getStatus();
                truck.setStatus("delivering");
                session.saveOrUpdate(truck);
                logger.info("Updated truck {} status from '{}' to 'delivering'", truckID, oldStatus);
            } else {
                logger.warn("Truck not found with ID: {}", truckID);
            }
        }
    }
}
