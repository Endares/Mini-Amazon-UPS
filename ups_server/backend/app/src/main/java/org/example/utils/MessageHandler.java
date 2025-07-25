package org.example.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.Socket;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Builder;

public class MessageHandler {
    private final Logger logger;
    
    public MessageHandler(Logger logger) {
        this.logger = logger;
        logger.info("MessageHandler initialized");
    }
    
    /**
     * Utility method to send a protobuf message to a socket
     * @param message The protobuf message to send
     * @param socket The socket to send the message to
     * @throws IOException If there is an error writing to the socket
     */
    public void sendMessage(com.google.protobuf.Message message, Socket socket) throws IOException {
        try {
            logger.info("Sending message of type: {} to {}:{}", 
                        message.getClass().getSimpleName(), 
                        socket.getInetAddress(), 
                        socket.getPort());
            logger.debug("Message content: {}", message.toString());
            System.out.println("Sending message of type: " + message.getClass().getSimpleName());
            message.writeDelimitedTo(socket.getOutputStream());
            System.out.println("Message sent successfully");
            logger.info("Message sent successfully");
        } catch (IOException e) {
            logger.error("Failed to send message: {}", e.getMessage());
            logger.debug("Exception details", e);
            System.out.println("Failed to send message: " + e.getMessage());
            throw e;
        }
        // try {
        //     CodedOutputStream codedOutputStream = CodedOutputStream.newInstance(socket.getOutputStream());
        //     codedOutputStream.writeUInt32NoTag(builder.build().toByteArray().length);
        //     builder.build().writeTo(codedOutputStream);
        //     codedOutputStream.flush();

        //     return true;
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     return false;
        // }

    }

    /**
     * Utility method to receive a protobuf message from a socket
     * @param parser The parser for the expected message type
     * @param socket The socket to receive the message from
     * @return The received message
     * @throws IOException If there is an error reading from the socket
     */
    public <T extends com.google.protobuf.Message> T receiveMessage(
            com.google.protobuf.Parser<T> parser, 
            Socket socket) throws IOException {
        try {
            logger.info("Waiting to receive message using parser: {} from {}:{}", 
                       parser.getClass().getSimpleName(),
                       socket.getInetAddress(),
                       socket.getPort());
            
            T message = parser.parseDelimitedFrom(socket.getInputStream());
            if (message == null) {
                logger.error("Received null message from socket {}:{}", 
                            socket.getInetAddress(), 
                            socket.getPort());
                throw new IOException("Received null message from socket");
            }
            
            logger.info("Successfully received message of type: {}", message.getClass().getSimpleName());
            logger.debug("Message content: {}", message.toString());
            return message;
        } catch (IOException e) {
            logger.error("Failed to receive message from {}:{}: {}", 
                        socket.getInetAddress(), 
                        socket.getPort(), 
                        e.getMessage());
            logger.debug("Exception details", e);
            throw e;
        }
    }
}
