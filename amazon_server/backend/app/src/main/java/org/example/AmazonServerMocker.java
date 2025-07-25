package org.example;

import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Protocol imports
import org.example.proto.WorldAmazon.AConnect;
import org.example.proto.WorldAmazon.AConnected;
import org.example.proto.WorldAmazon.AInitWarehouse;
import org.example.proto.UpsAmazon.ABookTruck;
import org.example.proto.UpsAmazon.AInformWorld;
import org.example.proto.UpsAmazon.AUCommunication;
import org.example.proto.UpsAmazon.UReceivedWorld;
import org.example.utils.MessageHandler;


public class AmazonServerMocker {
    /**
     * UPS - Amazon:
     * Amazon is the client
     * thus needs only a for sending messages to amazon
     * 
     * Amazon - World:
     * Amazon is the client of world,
     * thus only needs a socket for sending messages to world
     */

    private Logger logger;
    private Socket upsSocket;
    private Socket worldSocket;
    

    // WorldID is the ID of the world that UPS and Amazon are connected to
    private long WorldID;
    private int whNum;

    private final int WORLD_PORT = 23456;
    private final int UPS_PORT = 12345;

    private final MessageHandler messageHandler;

    public AmazonServerMocker(String host, int port, Logger logger, int whNum) throws IOException {
        this.logger = logger;
        this.messageHandler = new MessageHandler(logger);
        this.whNum = whNum;
        try {
            // initiate a connection to world
            worldSocket = new Socket(host, WORLD_PORT);
            logger.info("Connected to World simulator at {}:{}", host, WORLD_PORT);
            
            upsSocket = new Socket(host, port);
            logger.info("Connected to World simulator at {}:{}", host, port);

        } catch (IOException e) {
            logger.error("Failed to initialize UPS Server: {}", e.getMessage());
            // Close any open resources before re-throwing
            if (this.worldSocket != null) this.worldSocket.close();
            throw e;
        }
    }


    public AConnect.Builder createAConnect(Long WorldID) {
        logger.info("Creating AConnect message with WorldID: {}", WorldID);
        
        // create a UConnect message
        AConnect.Builder connectBuilder = AConnect.newBuilder();
        if (WorldID != null && WorldID > 0) {
            connectBuilder.setWorldid(WorldID);
        }
        connectBuilder.setIsAmazon(true);
        for (int i = 0; i < whNum; ++i) {
            AInitWarehouse.Builder wh = AInitWarehouse.newBuilder();
            wh.setId(i + 1).setX(i + 2).setY(i + 2);
            connectBuilder.addInitwh(wh.build());
        }

        logger.info("Initializing {} warehouses for the world", whNum);

        logger.debug("AConnect message created successfully");
        return connectBuilder;
    }


    public void connectToWorld() throws IOException {
        logger.info("Connecting to World simulator");
        // Create and send the UConnect message
        // UConnect uConnect = createUConnect(null).build();
        AConnect aConnect = createAConnect(WorldID).build();
        messageHandler.sendMessage(aConnect, worldSocket);
        
        // Receive the response
        try {
            
            AConnected connected = messageHandler.receiveMessage(AConnected.parser(), worldSocket);
            if (connected.getResult().equals("connected!")) {
                // set world id
                this.WorldID = connected.getWorldid();
                logger.info("Amazon Server successfully connected to World with ID: {}", this.WorldID);
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

    // connect to UPS
    public void sendAInformWorld() throws IOException {
        AInformWorld.Builder aInformWorld = AInformWorld.newBuilder();
        aInformWorld.setWorldid(WorldID);
        messageHandler.sendMessage(aInformWorld.build(), upsSocket);
        System.out.println("[DEBUG] Send world id to UPS");
    }

    public void connectToUps() {
        logger.info("Successfully sent world ID to UPS: {}", this.WorldID);
    }

    
    public void run() throws IOException {
        try {
            // 1. Send 
            // connect to world
            connectToWorld();
            logger.info("Get WorldID {} from World", this.WorldID);
            // 2. Connect to UPS
            // connectToUps();
            logger.info("Connect to UPS");

            
        } catch (IOException e) {
            logger.error("Amazon Error during world connection: {}", e.getMessage());
            throw e;
        }
    }

    // TODO: only for mocking, delete in the future
    public long getWorldid() {
        return WorldID;
    }
    
}
