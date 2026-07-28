# Movie Review Application

A Spring Boot REST API for managing Movies, Users, and Reviews.

## Technologies

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT Authentication
- MySQL
- MapStruct
- Lombok
- Swagger/OpenAPI
- JUnit 5 & Mockito

## Features

- CRUD operations for Movies, Users, and Reviews
- DTO-based layered architecture
- Input validation
- Global exception handling
- Pagination and sorting
- JWT Authentication
- Password hashing with BCrypt
- Role-based authorization (USER / ADMIN)
- Swagger API documentation
- Unit tests

## Installation

1. Clone the repository
2. Open the project in IntelliJ IDEA.
3. Configure the database in `application.properties`.
4. Run the application.


## Authentication

Use the following endpoints:

```
POST /auth/register
POST /auth/login
```

Copy the JWT token returned by `/auth/login` and send it in requests:

```
Authorization: Bearer <your_token>
```

## API Documentation

## Swagger
http://localhost:8080/swagger-ui/index.html

## Postman
The Postman collection is included in the repository.
