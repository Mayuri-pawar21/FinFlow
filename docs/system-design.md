# ⚙️ System Design

FinFlow is designed as a modular payment processing platform.

Current Architecture:

Client
→ Controller
→ Service
→ Mapper
→ Repository
→ MySQL

Future Architecture:

API Gateway

↓

Account Service

↓

Transaction Service

↓

Ledger Service

↓

Settlement Service

↓

Kafka Event Bus

↓

Redis Cache