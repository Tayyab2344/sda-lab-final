# Auction Bidding System - Microservice Architecture

This project is a simple **Auction Bidding System** implemented using a **Microservice Architecture**. Currently, it has only one service that runs the core auction functionality. The service is run using the `Main` class, and it provides a command-line interface to interact with the auction system.

## Architecture Overview

The system is designed with a **Microservice Architecture**, where each service is responsible for a specific functionality of the auction system. For this version, only one service is implemented, and it is responsible for handling users, auctions, bids, and viewing winning bids.

- **Main Service**: This is the core service that handles all auction operations.
  - Add Users
  - Create Auctions
  - Place Bids
  - View Auctions
  - View Winning Bids

## Technologies Used

- **Java** (JDK 8+)
- Object-Oriented Programming (OOP)
- Command-Line Interface (CLI) for interaction
- Microservice architecture (though currently with one service)

## How to Run the System

### Prerequisites

- **Java 8+** must be installed on your machine. You can verify the installation by running:

  ```bash
  java -version
