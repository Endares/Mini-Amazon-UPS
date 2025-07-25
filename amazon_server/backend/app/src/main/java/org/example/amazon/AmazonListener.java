package org.example.amazon;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.utils.*; 
import org.example.common.*;
import org.example.proto.UpsAmazon.*;
import org.hibernate.Transaction;
import org.slf4j.Logger;

import org.example.utils.MessageHandler;
import org.example.utils.SeqNumberGemerator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AmazonListener implements Runnable {
    private Socket amazonSocket;
    private SessionFactory sessionFactory;
    private Logger logger;
    private MessageHandler messageHandler;

    public AmazonListener(Socket socket, Logger logger) {
        this.amazonSocket = socket;
        this.sessionFactory = HibernateUtil.getSessionFactory();
        this.logger = logger;
        this.messageHandler = new MessageHandler(logger);
    }

    @Override
    public void run() {
        Session session = sessionFactory.openSession();
        try {
            while (true) {
                // 接收来自Amazon的消息
                logger.info("Waiting for messages from Amazon");
                AUCommunication auCommunication = messageHandler.receiveMessage(AUCommunication.parser(), amazonSocket);
                logger.info("!!!AmazonListener 1");
                
                // 处理预订卡车请求
                List<ABookTruck> bookTruckList = auCommunication.getBookingsList();
                List<AStartDeliver> startDeliverList = auCommunication.getDeliversList();
                
                if (bookTruckList.size() != 0 || startDeliverList.size() != 0) {
                    logger.info("Received AUCommunication with {} bookings and {} deliveries", 
                       bookTruckList.size(), startDeliverList.size());
                }

                // 处理ABookTruck请求
                if (bookTruckList.size() != 0) {
                    logger.info("Processing ABookTruck requests");
                    processBookTruckRequests(bookTruckList, session);
                }
                
                // 处理AStartDeliver请求
                if (startDeliverList.size() != 0) {
                    logger.info("Processing AStartDeliver requests");
                    processStartDeliverRequests(startDeliverList, session);
                }
                
                // 可以添加响应Amazon的确认消息（如有需要）
                
            }
        } catch (IOException e) {
            logger.error("Error in AmazonListener: {}", e.getMessage());
        } finally {
            session.close();
        }
    }
    
    private void processBookTruckRequests(List<ABookTruck> bookTruckList, Session session) {
        for (ABookTruck bookTruck : bookTruckList) {
            long packageId = bookTruck.getPackageid();
            int warehouseId = bookTruck.getWarehouseid();
            int warehouseX = bookTruck.getWarehousex();
            int warehouseY = bookTruck.getWarehousey();
            int destinationX = bookTruck.getDestinationx();
            int destinationY = bookTruck.getDestinationy();
            String upsId = null;
            
            logger.debug("Processing ABookTruck with packageId: {}", packageId);
            logger.debug("Warehouse details: id={}, x={}, y={}", warehouseId, warehouseX, warehouseY);
            logger.debug("Destination: x={}, y={}", destinationX, destinationY);
            
            // 检查是否有UPS ID
            if (bookTruck.hasUpsid()) {
                upsId = bookTruck.getUpsid();
                logger.debug("UPSID provided: {}", upsId);
            }
            
            // 序列号
            Long seqNum = null;
            if (bookTruck.hasSeqnum()) {
                seqNum = bookTruck.getSeqnum();
                logger.debug("Sequence number: {}", seqNum);
            }
            
            // 包裹详情
            String detail = null;
            if (bookTruck.hasDetail()) {
                detail = bookTruck.getDetail();
            }
            
            // 查找状态为idle或delivering或arrive warehouse的卡车
            List<Truck> trucks = session
                    .createQuery("FROM Truck WHERE status IN ('idle', 'delivering', 'arrive warehouse')", Truck.class)
                    .getResultList();
                    
            // 找到最近的卡车
            long minDistance = Long.MAX_VALUE;
            Truck closestTruck = null;
            
            for (Truck truck : trucks) {
                int xDiff = truck.getX() - warehouseX;
                int yDiff = truck.getY() - warehouseY;
                long distance = (long) xDiff * xDiff + (long) yDiff * yDiff;
                
                if (distance < minDistance) {
                    minDistance = distance;
                    closestTruck = truck;
                }
            }
            
            if (closestTruck == null) {
                logger.error("No available trucks found for booking request with packageId: {}", packageId);
                continue; // 跳过此请求，处理下一个
            }
            else {
                logger.info("Cloest truck id: {}", closestTruck.getId());
            }
            
            // 创建新的Shipment记录
            Transaction transaction1 = session.beginTransaction();
            try {
                Shipment newPackage = new Shipment();
                newPackage.setPackageId(packageId);
                newPackage.setWarehouseId(warehouseId);
                newPackage.setWarehouseX(warehouseX);
                newPackage.setWarehouseY(warehouseY);
                newPackage.setDestinationX(destinationX);
                newPackage.setDestinationY(destinationY);
                newPackage.setTruckId(closestTruck.getTruckId());
                if (upsId != null) {
                    newPackage.setUpsId(upsId);
                }
                if (detail != null) {
                    newPackage.setDetail(detail);
                }
                newPackage.setStatus("packed");
                
                // 保存Shipment并更新卡车状态
                session.persist(newPackage);
                closestTruck.setStatus("traveling");
                session.update(closestTruck);
                session.flush(); 
                transaction1.commit();
                String status = (String) session.createNativeQuery("SELECT status FROM trucks WHERE id = :id")
                                .setParameter("id", closestTruck.getId())
                                .uniqueResult();
                logger.info("直接从数据库查询的truck状态: {}", status);
                logger.info("Created new shipment with packageId: {} assigned to truckId: {}", 
                           packageId, closestTruck.getTruckId());
            } catch (Exception e) {
                transaction1.rollback();
                logger.error("Error while creating shipment: {}", e.getMessage());
                continue;
            }
            
            // 创建UGoPickupD指令
            Transaction transaction2 = session.beginTransaction();
            try {
                UGoPickupD newGoPickup = new UGoPickupD();
                newGoPickup.setTruckId(closestTruck.getTruckId());
                newGoPickup.setWhId(warehouseId);
                // 使用序列号生成器获取序列号
                newGoPickup.setSeqNum(SeqNumberGemerator.getNextSeqNumber());
                
                session.persist(newGoPickup);
                transaction2.commit();
                logger.info("Created UGoPickupD instruction for truckId: {} to warehouseId: {}", 
                           closestTruck.getTruckId(), warehouseId);
            } catch (Exception e) {
                transaction2.rollback();
                logger.error("Error while creating UGoPickupD: {}", e.getMessage());
            }
        }
    }
    
    private void processStartDeliverRequests(List<AStartDeliver> startDeliverList, Session session) {
        // 创建HashMap来存储相同truckId的包裹
        Map<Integer, List<Shipment>> truckPackagesMap = new HashMap<>();
        
        // 按truckId分组包裹
        for (AStartDeliver startDeliver : startDeliverList) {
            long packageId = startDeliver.getPackageid();
            logger.debug("Processing AStartDeliver for packageId: {}", packageId);
            
            // 查询Shipment
            Shipment shipment = session.createQuery("FROM Shipment WHERE packageId = :packageId", Shipment.class)
                    .setParameter("packageId", packageId)
                    .uniqueResult();
                    
            if (shipment == null) {
                logger.error("Shipment not found for packageId: {}", packageId);
                continue;
            }
            
            int truckId = shipment.getTruckId();
            truckPackagesMap.computeIfAbsent(truckId, k -> new ArrayList<>()).add(shipment);
        }
        
        // 为每个truckId创建UGoDeliverD指令
        for (Map.Entry<Integer, List<Shipment>> entry : truckPackagesMap.entrySet()) {
            int truckId = entry.getKey();
            List<Shipment> shipments = entry.getValue();
            
            Transaction transaction = session.beginTransaction();
            try {
                // 创建UGoDeliverD
                UGoDeliverD uGoDeliverD = new UGoDeliverD();
                uGoDeliverD.setTruckId(truckId);
                uGoDeliverD.setSeqNum(SeqNumberGemerator.getNextSeqNumber());
                
                // 为每个包裹创建UDeliveryLocationD
                for (Shipment shipment : shipments) {
                    UDeliveryLocationD uDeliveryLocationD = new UDeliveryLocationD();
                    uDeliveryLocationD.setPackageId(shipment.getPackageId());
                    uDeliveryLocationD.setX(shipment.getDestinationX());
                    uDeliveryLocationD.setY(shipment.getDestinationY());
                    
                    // 将UDeliveryLocationD添加到UGoDeliverD
                    uGoDeliverD.addUDeliveryLocation(uDeliveryLocationD);
                    
                    // 更新包裹状态
                    shipment.setStatus("loaded");
                    session.merge(shipment);
                }
                
                session.persist(uGoDeliverD);
                
                // 更新卡车状态
                Truck truck = session.createQuery("FROM Truck WHERE truckId = :truckId", Truck.class)
                        .setParameter("truckId", truckId)
                        .uniqueResult();
                        
                if (truck != null) {
                    truck.setStatus("arrive warehouse");
                    session.merge(truck);
                } else {
                    logger.error("Truck not found for truckId: {}", truckId);
                }
                
                transaction.commit();
                logger.info("Created UGoDeliverD instruction for truckId: {} with {} packages", 
                           truckId, shipments.size());
            } catch (Exception e) {
                transaction.rollback();
                logger.error("Error while creating UGoDeliverD: {}", e.getMessage());
            }
        }
    }
}
