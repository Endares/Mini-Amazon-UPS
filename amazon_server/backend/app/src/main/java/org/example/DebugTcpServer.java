package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DebugTcpServer implements Runnable {
    private final int port;
    
    public DebugTcpServer(int port) {
        this.port = port;
    }
    
    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("====================================================");
            System.out.println("Debug TCP Server started on port " + port);
            System.out.println("Waiting for connections...");
            System.out.println("====================================================");
            
            while (true) {
                try {
                    // 等待连接
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("\n\n====================================================");
                    System.out.println("New connection from: " + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
                    System.out.println("Connection time: " + new Date());
                    
                    // 启动新线程处理连接，避免阻塞主循环
                    new Thread(() -> handleConnection(clientSocket)).start();
                    
                } catch (IOException e) {
                    System.out.println("Error accepting connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Could not start server on port " + port + ": " + e.getMessage());
        }
    }
    
    private void handleConnection(Socket socket) {
        try {
            System.out.println("Handling connection from " + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
            InputStream in = socket.getInputStream();
            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            
            // 持续读取数据
            while ((bytesRead = in.read(buffer)) != -1) {
                if (bytesRead > 0) {
                    System.out.println("\n----- RECEIVED DATA (" + new Date() + ") -----");
                    System.out.println("Bytes received: " + bytesRead);
                    
                    // 打印十六进制表示
                    System.out.println("Raw data (hex): ");
                    StringBuilder hexBuilder = new StringBuilder();
                    StringBuilder asciiBuilder = new StringBuilder();
                    
                    for (int i = 0; i < bytesRead; i++) {
                        byte b = buffer[i];
                        hexBuilder.append(String.format("%02X ", b & 0xFF));
                        
                        // 如果是可打印ASCII字符，显示字符，否则显示点
                        if (b >= 32 && b < 127) {
                            asciiBuilder.append((char) b);
                        } else {
                            asciiBuilder.append('.');
                        }
                        
                        // 每16个字节换一行，并显示ASCII表示
                        if ((i + 1) % 16 == 0 || i == bytesRead - 1) {
                            // 补全最后一行的空格
                            while ((i + 1) % 16 != 0) {
                                hexBuilder.append("   ");
                                i++;
                            }
                            System.out.println(hexBuilder + "  |  " + asciiBuilder);
                            hexBuilder = new StringBuilder();
                            asciiBuilder = new StringBuilder();
                        }
                    }
                    
                    // 发送简单的响应确认收到数据
                    try {
                        socket.getOutputStream().write("Received data".getBytes());
                    } catch (IOException e) {
                        System.out.println("Error sending response: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing connection: " + e.getMessage());
        } finally {
            try {
                socket.close();
                System.out.println("Connection closed: " + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
            } catch (IOException e) {
                System.out.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}