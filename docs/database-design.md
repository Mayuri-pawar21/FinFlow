# 🗄️ Database Design

## Overview

FinFlow uses a relational database (MySQL) to store financial data with consistency and integrity.

The current implementation includes the **Account** entity. Future versions will introduce Transaction, Ledger, Settlement, and Audit entities.

---

## Current Entity

### Account

| Field | Type | Description |
|-------|------|-------------|
| id | UUID | Primary Key |
| accountNumber | String | Unique Account Number |
| accountHolderName | String | Account Holder Name |
| bankCode | String | Bank Identifier |
| currency | Enum | Account Currency |
| balance | BigDecimal | Current Balance |
| status | Enum | ACTIVE / FROZEN / CLOSED |
| createdAt | LocalDateTime | Account Creation Time |

---

## Future Entities

- Transaction
- Ledger
- Settlement
- Audit Log