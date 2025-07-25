package org.example.utils;

import org.example.common.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

public class PrintHelper {
    private SessionFactory sessionFactory;

    public PrintHelper() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void printTruck() {
        Session session = sessionFactory.openSession();
        List<Truck> trucks = session.createQuery("FROM Truck", Truck.class).getResultList();

        if (trucks.isEmpty()) {
            System.out.println("No trucks found in the database.");
            return;
        }

        System.out.println("=================== TRUCKS ===================");
        System.out.println("ID\tTRUCK_ID\tX\tY\tSTATUS\tIS_ARRIVED");
        System.out.println("---------------------------------------------");

        for (Truck truck : trucks) {
            System.out.printf("%d\t%d\t\t%d\t%d\t%s\t%b\n",
                    truck.getId(),
                    truck.getTruckId(),
                    truck.getX(),
                    truck.getY(),
                    truck.getStatus(),
                    truck.getIsArrived());
        }
        System.out.println("=============================================");

    }

    public void printAllTruckInfo() {
        Session session = sessionFactory.openSession();
        List<Truck> trucks = session.createQuery("FROM Truck", Truck.class).getResultList();

        if (trucks.isEmpty()) {
            System.out.println("No trucks found in the database.");
            return;
        }

        for (Truck truck : trucks) {
            System.out.println("\n=== Truck Details ===");
            System.out.println("ID: " + truck.getId());
            System.out.println("Truck ID: " + truck.getTruckId());
            System.out.println("Position: (" + truck.getX() + ", " + truck.getY() + ")");
            System.out.println("Status: " + truck.getStatus());
            System.out.println("Is Arrived: " + truck.getIsArrived());

            // Find related shipments for this truck
            List<Shipment> shipments = session.createQuery(
                    "FROM Shipment WHERE truck_id = :truckId", Shipment.class)
                    .setParameter("truckId", truck.getTruckId())
                    .getResultList();

            if (!shipments.isEmpty()) {
                System.out.println("\n  Assigned Packages:");
                for (Shipment shipment : shipments) {
                    System.out.println("  - Package ID: " + shipment.getPackageId());
                    System.out.println("    Status: " + shipment.getStatus());
                    System.out.println("    Destination: (" + shipment.getDestinationX() +
                            ", " + shipment.getDestinationY() + ")");
                }
            } else {
                System.out.println("\n  No packages assigned to this truck.");
            }
            System.out.println("====================");
        }

    }

    public void printUsers() {
        Session session = sessionFactory.openSession();
        List<User> users = session.createQuery("FROM User", User.class).getResultList();

        if (users.isEmpty()) {
            System.out.println("No users found in the database.");
            return;
        }

        System.out.println("================= USERS =================");
        System.out.println("ID\tUSERNAME\tEMAIL");
        System.out.println("----------------------------------------");

        for (User user : users) {
            System.out.printf("%s\t\t%s\n",
                    user.getUsername(),
                    user.getEmail());
        }
        System.out.println("========================================");

    }

    public void printShipments() {
        Session session = sessionFactory.openSession();
        List<Shipment> shipments = session.createQuery("FROM Shipment", Shipment.class).getResultList();

        if (shipments.isEmpty()) {
            System.out.println("No shipments found in the database.");
            return;
        }

        System.out.println("==================== SHIPMENTS ====================");
        System.out.println("PACKAGE_ID\tSTATUS\t\tWH_ID\tDEST(X,Y)\tTRUCK_ID");
        System.out.println("---------------------------------------------------");

        for (Shipment shipment : shipments) {
            System.out.printf("%d\t\t%s\t\t%d\t(%d,%d)\t\t%s\n",
                    shipment.getPackageId(),
                    shipment.getStatus(),
                    shipment.getWarehouseId(),
                    shipment.getDestinationX(),
                    shipment.getDestinationY(),
                    shipment.getTruckId() != null ? shipment.getTruckId() : "N/A");
        }
        System.out.println("===================================================");

    }

    public void printWarehouses() {
        Session session = sessionFactory.openSession();
        List<Warehouse> warehouses = session.createQuery("FROM Warehouse", Warehouse.class).getResultList();

        if (warehouses.isEmpty()) {
            System.out.println("No warehouses found in the database.");
            return;
        }

        System.out.println("============= WAREHOUSES =============");
        System.out.println("WH_ID\t\tLOCATION(X,Y)");
        System.out.println("-------------------------------------");

        for (Warehouse warehouse : warehouses) {
            System.out.printf("%d\t\t(%d,%d)\n",
                    warehouse.getWarehouseId(),
                    warehouse.getWarehouseX(),
                    warehouse.getWarehouseY());
        }
        System.out.println("=====================================");

    }

    public void printDeliveries() {
        Session session = sessionFactory.openSession();
        List<UGoDeliverD> deliveries = session.createQuery("FROM UGoDeliverD", UGoDeliverD.class).getResultList();

        if (deliveries.isEmpty()) {
            System.out.println("No deliveries found in the database.");
            return;
        }

        System.out.println("================ DELIVERIES ================");

        for (UGoDeliverD delivery : deliveries) {
            System.out.println("\nDelivery ID: " + delivery.getId());
            System.out.println("Truck ID: " + delivery.getTruckId());
            System.out.println("Sequence Number: " + delivery.getSeqNum());

            List<UDeliveryLocationD> packages = delivery.getPackages();

            if (packages != null && !packages.isEmpty()) {
                System.out.println("Packages:");
                for (UDeliveryLocationD packageLoc : packages) {
                    System.out.printf("  - Package ID: %d, Location: (%d,%d)\n",
                            packageLoc.getPackageId(),
                            packageLoc.getX(),
                            packageLoc.getY());
                }
            } else {
                System.out.println("No packages associated with this delivery.");
            }
            System.out.println("-------------------------------------------");
        }
        System.out.println("============================================");

    }

    public void printPickups() {
        Session session = sessionFactory.openSession();
        List<UGoPickupD> pickups = session.createQuery("FROM UGoPickupD", UGoPickupD.class).getResultList();

        if (pickups.isEmpty()) {
            System.out.println("No pickups found in the database.");
            return;
        }

        System.out.println("================ PICKUPS ================");
        System.out.println("ID\tTRUCK_ID\tWAREHOUSE_ID\tSEQ_NUM");
        System.out.println("----------------------------------------");

        for (UGoPickupD pickup : pickups) {
            System.out.printf("%d\t\t%d\t\t%d\n",
                    pickup.getTruckId(),
                    pickup.getWhId(),
                    pickup.getSeqNum());
        }
        System.out.println("========================================");

    }

    public void printAllDatabaseInfo() {
        System.out.println("\n\n========== DATABASE CONTENTS ==========\n");

        printUsers();
        System.out.println("\n");

        printWarehouses();
        System.out.println("\n");

        printTruck();
        System.out.println("\n");

        printShipments();
        System.out.println("\n");

        printPickups();
        System.out.println("\n");

        printDeliveries();

        System.out.println("\n\n======================================\n");
    }
}
