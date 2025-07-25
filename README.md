# Mini Amazon & UPS Simulation System

## 📦 Project Overview

This project implements a simplified simulation of an e-commerce platform ("Mini Amazon") and a logistics system ("Mini UPS") using Google Protocol Buffers for communication with a world simulator. It supports product purchasing, warehousing, packing, pickup, and delivery. A custom protocol governs coordination between Amazon and UPS components.

---

## 📁 Directory Structure

```yaml
.
├── backend/ # Backend services for Amazon and UPS
├── frontend/ # Web interface for ordering and tracking
├── nginx/ # Reverse proxy configuration
├── protocol/ # Amazon-UPS interoperation protocol
├── test_connection/ # World server connection tests
├── docker-compose.yml # Docker orchestration file
├── Features.md # Feature documentation
├── dangerlog.md # Debugging logs and issues
├── README.md # Project documentation
└── Task # Task planning (optional placeholder)
```
---

## 🌐 System Architecture & Interaction Principles

### 1. Amazon Server

Responsible for the e-commerce operations:
- Place orders (`buy`)
- Pack shipments (`topack`)
- Load trucks (`load`)
- Query package status (`queries`)

Communicates with the World Simulator via `amazon.proto` and with UPS Server via custom protocol.

### 2. UPS Server

Responsible for logistics operations:
- Dispatch trucks for pickup (`pickups`)
- Schedule deliveries (`deliveries`)
- Query truck status (`queries`)

Communicates with the World Simulator via `ups.proto` and with Amazon Server for shipment coordination.

### 3. World Simulator

Simulates the environment with trucks and warehouses:
- One Amazon and one UPS server may connect per world
- Message delivery uses `seqnum` and `ack` for reliability
- Supports adjustable simulation speed via `simspeed` (for testing only)

---

## 🔁 Amazon–UPS Communication Protocol Summary

| Action                   | Sender         | Receiver       | Description |
|--------------------------|----------------|----------------|-------------|
| Create delivery request  | Amazon Server  | UPS Server     | Includes package ID, warehouse and destination |
| Dispatch truck to pickup | UPS Server     | World Simulator| Sends `pickups` command |
| Notify ready-to-load     | World Simulator → Amazon → UPS | Shipment is ready for loading |
| Confirm loading complete | Amazon Server  | UPS Server     | Triggers delivery scheduling |
| Confirm delivery         | World Simulator| UPS Server     | `delivered` + `completions` messages |
| Track status             | UPS Server     | Amazon Server / Web | Enables user-facing tracking features |

---

## 🚀 Deployment

### Prerequisites

- Docker
- Docker Compose

### Run the Project

```bash
docker-compose up --build
