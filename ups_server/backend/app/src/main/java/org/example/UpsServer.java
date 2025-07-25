package org.example;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;
import org.example.world.*;
import org.example.amazon.AmazonListener;
import org.example.amazon.AmazonSender;

// Local classes
import org.example.common.Truck;
import org.example.proto.WorldUps;
import org.example.proto.UpsAmazon.*;
import org.example.proto.WorldUps.UConnect;
import org.example.proto.WorldUps.UConnected;
import org.example.proto.WorldUps.UInitTruck;
import org.example.utils.MessageHandler;
import org.example.world.WorldReceiver;
 
public class UpsServer {
    /**
     * UPS - Amazon:
     * UPS is the server that listens for connections amazon,
     * thus needs a listening socket for amazon and a socket for sending messages to amazon
     * 
     * UPS - World:
     * UPS is the client of world,
     * thus only needs a socket for sending messages to world
     */

    private static final Logger logger = LoggerFactory.getLogger(UpsServer.class);
    private ServerSocket UpsServerSocket;
    private Socket amazonSocket;
    private Socket worldSocket;
    
    // sessionFactory is used to create a session to the database
    private SessionFactory sessionFactory;

    // WorldID is the ID of the world that UPS and Amazon are connected to
    private long WorldID;

    private int truckNum;

    private final int WORLD_PORT = 12345;
    private final int AMAZON_PORT = 23456;

    private final MessageHandler messageHandler;

    public UpsServer(int serverPort, String worldHostName, SessionFactory sessionFactory, int truckNum) throws IOException {
        this.messageHandler = new MessageHandler(logger);
        try {
            // create a server socket for amazon
            this.UpsServerSocket = new ServerSocket(serverPort);
            logger.info("UPS Server started on port: {}", serverPort);

            // initiate a connection to world
            this.worldSocket = new Socket(worldHostName, WORLD_PORT);
            logger.info("Connected to World simulator at {}:{}", worldHostName, WORLD_PORT);

            // create a session to the database
            this.sessionFactory = sessionFactory;
            logger.info("Database session factory initialized");

            // Initialize WorldID to -1, it will be set after connecting to the world

            this.truckNum = truckNum;

        } catch (IOException e) {
            logger.error("Failed to initialize UPS Server: {}", e.getMessage());
            // Close any open resources before re-throwing
            if (this.worldSocket != null) this.worldSocket.close();
            if (this.UpsServerSocket != null) this.UpsServerSocket.close();
            throw e;
        }
    }


    public UConnect.Builder createUConnect(Long WorldID) {
        logger.info("Creating UConnect message with WorldID: {}", WorldID);
        
        // create a UConnect message
        UConnect.Builder connectBuilder = UConnect.newBuilder();
        if (WorldID != null && WorldID > 0) {
            connectBuilder.setWorldid(WorldID);
        }
        connectBuilder.setIsAmazon(false);
        
        logger.info("Initializing {} trucks for the world", truckNum);

        List<UInitTruck> trucks = new ArrayList<>();
        for (int i = 0; i < truckNum; i++) { 
            UInitTruck.Builder truckBuilder = UInitTruck.newBuilder();
            truckBuilder.setId(i);
            truckBuilder.setX(0);
            truckBuilder.setY(0);
            trucks.add(truckBuilder.build());
        }
        connectBuilder.addAllTrucks(trucks);

        // add trucks to trucks table in database
        logger.info("Saving {} trucks to database", trucks.size());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            for (UInitTruck truck : trucks) {
                Truck truckRecord = new Truck();
                truckRecord.setTruckId(truck.getId());
                truckRecord.setX(truck.getX());
                truckRecord.setY(truck.getY());
                truckRecord.setStatus("idle");
                truckRecord.setIsArrived(false);
                session.persist(truckRecord);
            }
            transaction.commit();
            logger.info("Successfully saved all trucks to database");
        } catch (Exception e) {
            logger.error("Failed to save trucks to database: {}", e.getMessage());
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

        logger.debug("UConnect message created successfully");
        return connectBuilder;
    }


    public void connectToWorld() throws IOException {
        logger.info("Connecting to World simulator");
        // Create and send the UConnect message
        // UConnect uConnect = createUConnect(null).build();
        UConnect uConnect = createUConnect(WorldID).build();
        messageHandler.sendMessage(uConnect, worldSocket);
        
        // Receive the response
        try {
            
            UConnected connected = messageHandler.receiveMessage(UConnected.parser(), worldSocket);
            if (connected.getResult().equals("connected!")) {
                // set world id
                this.WorldID = connected.getWorldid();
                logger.info("Successfully connected to World with ID: {}", this.WorldID);
            } else {
                String errorMsg = "Failed to connect to world: " + connected.getResult();
                logger.error(errorMsg);
                throw new IOException(errorMsg);
            }
        } catch (IOException e) {
            logger.error("Error during world connection: {}", e.getMessage());
            throw e;
        }

    }

    public void connectToAmazon() throws IOException {
        try {
            // 3. Listen for amazon's connection
            amazonSocket = UpsServerSocket.accept();
            logger.info("Connection created from amazon on port: {}", amazonSocket.getPort());
            
            // 4. get worldID from Amazon
            AInformWorld aInfo = messageHandler.receiveMessage(AInformWorld.parser(), amazonSocket);
            logger.info("Received first message from Amazon");
            this.WorldID = aInfo.getWorldid();
            logger.info("Get WorldID {} from Amazon", this.WorldID);
        } catch (IOException e) {
            logger.error("Error during Amazon connection: {}", e.getMessage());
            throw e;
        }
    }

    
    public void run() throws IOException {
        try {
            

            logger.info("checkpoint1");
            amazonSocket = UpsServerSocket.accept();

            logger.info("Connection created from amazon on port: {}", amazonSocket.getPort());
            
            // 接收Amazon发送的worldID
            AInformWorld aInfo = messageHandler.receiveMessage(AInformWorld.parser(), amazonSocket);
            this.WorldID = aInfo.getWorldid();
            logger.info("Get WorldID {} from Amazon", this.WorldID);

            UReceivedWorld.Builder uReceivedWorld = UReceivedWorld.newBuilder();
            uReceivedWorld.setWorldid(this.WorldID);
            messageHandler.sendMessage(uReceivedWorld.build(), amazonSocket);
            logger.info("Sent UReceivedWorld confirmation to Amazon with WorldID: {}", this.WorldID);

            connectToWorld();
            
            // 启动 AmazonListener 线程
            AmazonListener amazonListener = new AmazonListener(amazonSocket, logger);
            new Thread(amazonListener).start();
            logger.info("Started Amazon listener thread");

            AmazonSender amazonSender = new AmazonSender(amazonSocket, logger);
            new Thread(amazonSender).start();
            logger.info("Started Amazon sender thread");

            // 启动 WorldReceiver 线程
            WorldReceiver worldReceiver = new WorldReceiver(worldSocket, sessionFactory, messageHandler, logger);
            new Thread(worldReceiver).start();
            logger.info("Started World listener thread");

            WorldSender worldSender = new WorldSender(worldSocket, sessionFactory, messageHandler, logger);
            new Thread(worldSender).start();
            logger.info("Started World sender thread");
            
        } catch (IOException e) {
            logger.error("Error during world connection: {}", e.getMessage());
            throw e;
        }
    }

    // TODO: delete this in the future
    public void setWorldid(long id) {
        this.WorldID = id;
    }

    public Logger getLogger() {
        return UpsServer.logger;
    }

}
