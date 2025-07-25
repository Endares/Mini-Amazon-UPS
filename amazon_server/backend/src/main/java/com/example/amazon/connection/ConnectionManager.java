package com.example.amazon.connection;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.amazon.exceptions.WorldConnectionException;

import jakarta.annotation.PreDestroy;

@Component
public class ConnectionManager {
    private final String host;
    private final int port;
    private Socket socket;
    private BufferedOutputStream out;
    private BufferedInputStream in;
    private final int readTimeoutMs;
    private final int connectTimeoutMs;

    /**
     * Constructor for ConnectionManager.
     * @param host the server host
     * @param port the server port
     * @param connectTimeoutMs the connection timeout in milliseconds
     * @param readTimeoutMs the read timeout in milliseconds
     * @throws IllegalArgumentException if host or port is invalid
     */
    public ConnectionManager(
        @Value("${WORLD_HOST:localhost}") String host,
        @Value("${WORLD_PORT:23456}") int port,
        @Value("${WORLD_CONNECT_TIMEOUT:3000}") int connectTimeoutMs,
        @Value("${WORLD_READ_TIMEOUT:10000}")  int readTimeoutMs
    ) {
        if (host == null || host.isBlank()) {
            throw new IllegalArgumentException("WORLD_HOST must not be empty");
        }
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException("WORLD_PORT must be between 1 and 65535");
        }
        if (connectTimeoutMs < 0) {
            throw new IllegalArgumentException("WORLD_CONNECT_TIMEOUT must be non-negative");
        }
        if (readTimeoutMs < 0) {
            throw new IllegalArgumentException("WORLD_READ_TIMEOUT must be non-negative");
        }
        this.host = host;
        this.port = port;
        this.connectTimeoutMs = connectTimeoutMs;
        this.readTimeoutMs = readTimeoutMs;
    }

    /**
     * Initializes the socket connection.
     * @throws RuntimeException if an error occurs while initializing the socket
     */
    // public void init() {
    //     connect();
    // }

    /**
     * Shuts down the socket connection.
     * @throws RuntimeException if an error occurs while shutting down the socket
     */
    @PreDestroy
    public void shutdown() {
        close();
    }

    /**
     * Closes the socket connection.
     * @throws RuntimeException if an error occurs while closing the socket
     */
    public void close() {
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        } catch (Exception e) {
            throw new WorldConnectionException("Failed to close socket", e);
        }
    }

    /**
     * Connects to the server.
     * @throws RuntimeException if an error occurs while connecting to the server
     */
    public synchronized void connect() {
        try {
            socket = new Socket();
            socket.setTcpNoDelay(true);
            socket.connect(new InetSocketAddress(host, port), connectTimeoutMs);
            socket.setSoTimeout(readTimeoutMs);
            BufferedOutputStream bout = new BufferedOutputStream(socket.getOutputStream());
            BufferedInputStream  bin  = new BufferedInputStream(socket.getInputStream());
            this.out = bout;
            this.in  = bin;
        } catch (Exception e) {
            throw new WorldConnectionException("Failed to connect to " + host + ":" + port, e);
        }
    }


    /**
     * Returns the input stream of the socket.
     * @return the input stream
     * @throws RuntimeException if an error occurs while getting the input stream
     */
    public InputStream getIn()  { 
        try {
            return socket.getInputStream();
        } catch (Exception e) {
            throw new WorldConnectionException("Failed to get input stream", e);
        }
    }

    /**
     * Returns the output stream of the socket.
     * @return the output stream
     * @throws RuntimeException if an error occurs while getting the output stream
     */
    public OutputStream getOut(){ 
        try {
            return socket.getOutputStream();
        } catch (Exception e) {
            throw new WorldConnectionException("Failed to get output stream", e);
        }
    }

    /**
     * Reconnects to the server.
     * @throws RuntimeException if an error occurs while reconnecting to the server
     */
    public void reconnect() { 
        close();
        connect();
    }
}