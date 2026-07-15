package com.finflow.transaction_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finflow.transaction_service.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {

	Optional<Account> findByAccountNumber(String accountNumber);

    boolean existsByAccountNumber(String accountNumber);
}

