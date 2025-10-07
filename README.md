# Backend-Ecommerce
Spring, Spring Data JPA, MySQL, OAuth2, Rest Controller etc...
 E-Commerce Backend – Spring Boot
Overview

This is the backend service for a full-stack E-commerce Application, built using Spring Boot.
It provides REST APIs for user authentication, product management, cart functionality, and order handling — secured with JWT Authentication.

The backend is designed to integrate seamlessly with a React-based frontend.

 Features

 User Registration & Authentication (JWT-based)
 Role-based Access Control (Admin & User)
 Product CRUD APIs
 Cart & Order Management
 Spring Data JPA with MySQL
 Exception Handling & Validation
 Cross-Origin Support for Frontend Integration

 Tech Stack
Category	Technology Used
Language	Java 17
Framework	Spring Boot
Security	Spring Security, JWT
Database	MySQL
ORM	Hibernate / JPA
Build Tool	Maven
API Testing	Postman

 How to Run the Project
 Prerequisites

Ensure you have installed:
Java 17+
Maven
MySQL
Any API testing tool (e.g., Postman)

 Steps to Run Locally
1️ Clone the Repository
git clone https://github.com/<your-username>/ecommerce-backend.git
cd ecommerce-backend

2️ Configure the Database

Open src/main/resources/application.properties and update:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
jwt.secret=yourSecretKey

3️\ Build the Project
mvn clean install

4️Run the Application
mvn spring-boot:run
