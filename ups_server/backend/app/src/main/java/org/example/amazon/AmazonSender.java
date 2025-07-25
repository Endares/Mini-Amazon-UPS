package org.example.amazon;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

import org.example.common.Shipment;
import org.example.common.Truck;
import org.example.proto.UpsAmazon.*;
import org.example.proto.*;
import org.example.utils.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.utils.SeqNumberGemerator;

public class AmazonSender implements Runnable {
    private Socket amazonSocket;
    private SessionFactory sessionFactory;
    private final Logger logger;
    private final MessageHandler messageHandler;
    
    public AmazonSender(Socket socket, Logger logger) {
        this.amazonSocket = socket;
        this.sessionFactory = HibernateUtil.getSessionFactory();
        this.logger = logger;
        this.messageHandler = new MessageHandler(logger);
    }

    public AmazonSender(Socket socket, SessionFactory sessionFactory, MessageHandler messageHandler, Logger logger) {
        this.amazonSocket = socket;
        this.sessionFactory = HibernateUtil.getSessionFactory();
        this.logger = logger;
        this.messageHandler = new MessageHandler(logger);
    }
    
    @Override
    public void run() {
        logger.info("Starting Amazon sender thread");
        Session session = sessionFactory.openSession();
        
        while (true) {
            try {
                // 每5秒检查一次数据库状态
                Thread.sleep(5000);
                
                // 创建UACommunication消息
                UACommunication.Builder uaCommunication = UACommunication.newBuilder();
                
                Transaction transaction = session.beginTransaction();
                try {
                    // 检查所有状态为"arrive warehouse"的卡车
                    List<Truck> trucksArrived = session
                            .createQuery("FROM Truck WHERE status = 'arrive warehouse'", Truck.class)
                            .getResultList();
                    
                    if (!trucksArrived.isEmpty()) {
                        logger.info("Found {} trucks that have arrived at warehouses", trucksArrived.size());
                    }
                    
                    // 处理每一个到达仓库的卡车
                    for (Truck truck : trucksArrived) {
                        // 查找与该卡车关联且状态为"packed"的包裹
                        List<Shipment> packagesToLoad = session
                                .createQuery("FROM Shipment WHERE status = 'packed' AND truckId = :truckId", Shipment.class)
                                .setParameter("truckId", truck.getTruckId())
                                .getResultList();
                        
                        // 更新卡车状态为"loading"
                        truck.setStatus("loading");
                        session.saveOrUpdate(truck);
                        
                        // 处理每个待装载的包裹
                        for (Shipment shipment : packagesToLoad) {
                            shipment.setStatus("loading");
                            session.saveOrUpdate(shipment);
                            
                            // 创建UTruckArrived消息
                            UTruckArrived.Builder uTruckArrived = UTruckArrived.newBuilder()
                                    .setPackageid(shipment.getPackageId())
                                    .setTruckid(truck.getTruckId())
                                    .setSeqnum(SeqNumberGemerator.getNextSeqNumber());
                            
                            // 将UTruckArrived添加到UACommunication中
                            uaCommunication.addArrived(uTruckArrived);
                            
                            logger.info("Added UTruckArrived message for package: {}, truck: {}", 
                                      shipment.getPackageId(), truck.getTruckId());
                        }
                    }
                    
                    // 查找所有已送达的包裹
                    List<Shipment> deliveredPackages = session
                            .createQuery("FROM Shipment WHERE status = 'delivered'", Shipment.class)
                            .getResultList();
                    
                    if (!deliveredPackages.isEmpty()) {
                        logger.info("Found {} packages that have been delivered", deliveredPackages.size());
                    }
                    
                    // 处理每个已送达的包裹
                    for (Shipment shipment : deliveredPackages) {
                        // 创建UDelivered消息
                        UDelivered.Builder uDelivered = UDelivered.newBuilder()
                                .setPackageid(shipment.getPackageId());
                        
                        // 更新包裹状态为"finished"
                        shipment.setStatus("finished");
                        session.saveOrUpdate(shipment);
                        
                        // 将UDelivered添加到UACommunication中
                        uaCommunication.addDelivered(uDelivered);
                        
                        logger.info("Added UDelivered message for package: {}", shipment.getPackageId());
                    }
                    
                    // 如果有消息需要发送
                    if (uaCommunication.getArrivedCount() > 0 || uaCommunication.getDeliveredCount() > 0) {
                        try {
                            // 发送UACommunication消息
                            messageHandler.sendMessage(uaCommunication.build(), amazonSocket);
                            logger.info("Sent UACommunication with {} arrived trucks and {} delivered packages", 
                                      uaCommunication.getArrivedCount(), uaCommunication.getDeliveredCount());
                        } catch (IOException e) {
                            logger.error("Error sending message to Amazon: {}", e.getMessage());
                            // 如果连接断开，可以尝试重新连接或退出
                            throw e; // 将异常重新抛出，以便在外层进行处理
                        }
                    }
                    
                    transaction.commit();
              
                    // PrintHelper printer = new PrintHelper();
                    // printer.printAllDatabaseInfo();
                } catch (IOException e) {
                    transaction.rollback();
                    logger.error("Connection error with Amazon: {}", e.getMessage());
                    break; // 终止循环
                } catch (Exception e) {
                    transaction.rollback();
                    logger.error("Error processing database updates: {}", e.getMessage());
                }
                
            } catch (InterruptedException e) {
                logger.error("Amazon sender thread interrupted: {}", e.getMessage());
                break;
            }
        }
        
        session.close();
        logger.info("Amazon sender thread terminated");
    }
}