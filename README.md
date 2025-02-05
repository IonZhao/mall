# Online Shopping System - Microservices Backend

## Overview
This project is a **microservices-based Spring Boot application** that serves as the backend for an online shopping system. The system is divided into multiple microservices, each handling a specific business domain, ensuring scalability and maintainability.

## Microservices Architecture
The backend consists of **five microservices**, each responsible for a distinct function:
- **Cart Service** - Manages shopping cart operations.
- **Item Service** - Handles product details and inventory.
- **Pay Service** - Processes payments and transactions.
- **Trade Service** - Manages orders and transactions.
- **User Service** - Handles user authentication and profile management.

## Deployment
All microservices are containerized and deployed using **Docker**, along with supporting services:
- **MySQL** - Database for storing application data.
- **Nginx** - Reverse proxy and load balancer.
- **Nacos** - Service discovery and configuration management.

## Technologies Used
- **Spring Boot** - Microservices framework
- **Spring Cloud** - Microservices orchestration
- **Spring Cloud OpenFeign** - Declarative REST client for service-to-service communication
- **Docker** - Containerization
- **MySQL** - Relational database
- **Nginx** - Load balancing and proxy server
- **Nacos** - Service registry and configuration center

## Running the Project
Ensure that you have **Docker** installed and run the following command to start all services:
```sh
docker-compose up -d
```

## Future Enhancements
- Implement API Gateway for centralized routing and security.
- Add Redis caching for improved performance.
- Implement CI/CD pipeline for automated deployment.

## License
This project is licensed under the MIT License.

