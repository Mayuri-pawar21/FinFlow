# 🏗️ FinFlow Architecture

## Overview

FinFlow follows a layered architecture to ensure separation of concerns, maintainability, scalability, and testability.

Each layer has a single responsibility and communicates only with the adjacent layer.

---

## Architecture Diagram

> _(Insert the architecture image here.)_

---

## Layered Architecture

```
                Client (Postman)

                        │

                        ▼

               AccountController

                        │

                        ▼

                AccountService

                        │

                        ▼

                 AccountMapper

                        │

                        ▼

               AccountRepository

                        │

                        ▼

                 Hibernate (JPA)

                        │

                        ▼

                    MySQL Database
```

---

# Layer Responsibilities

## Controller Layer

The controller is responsible for exposing REST APIs.

Responsibilities:

- Receive HTTP requests
- Validate request DTOs
- Call the Service layer
- Return HTTP responses

Business logic is **never written inside controllers.**

---

## Service Layer

The service layer contains the application's business logic.

Responsibilities:

- Validate business rules
- Prevent duplicate accounts
- Set default account status
- Coordinate repository operations

The service layer acts as the heart of the application.

---

## Mapper Layer

The mapper converts DTOs into entities and entities into DTOs.

Why?

Database entities should never be directly exposed through REST APIs.

Benefits:

- Better security
- Loose coupling
- Easier maintenance

---

## Repository Layer

The repository interacts with the database using Spring Data JPA.

Responsibilities:

- CRUD operations
- Custom queries
- Database abstraction

The service layer never writes SQL directly.

---

## Entity Layer

Entities represent database tables.

Each entity is mapped using JPA annotations.

Example:

- Account
- Transaction
- Ledger

---

# Request Lifecycle

```
Client

↓

Controller

↓

DTO Validation

↓

Service

↓

Mapper

↓

Repository

↓

Hibernate

↓

MySQL

↓

Repository

↓

Mapper

↓

Response DTO

↓

Controller

↓

HTTP Response
```

---

# Design Principles

The project follows:

- Layered Architecture
- DTO Pattern
- Repository Pattern
- Mapper Pattern
- Separation of Concerns
- Dependency Injection
- SOLID Principles

---

# Why Layered Architecture?

Layered architecture keeps responsibilities separated.

Benefits:

- Easy testing
- Better scalability
- Better readability
- Easier debugging
- Loose coupling
- Easier maintenance

This architecture is commonly used in enterprise Spring Boot applications.
