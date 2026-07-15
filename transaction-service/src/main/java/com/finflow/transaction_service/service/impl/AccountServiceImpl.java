package com.finflow.transaction_service.service.impl;

import org.springframework.stereotype.Service;

import com.finflow.transaction_service.dto.request.CreateAccountRequest;
import com.finflow.transaction_service.dto.response.AccountResponse;
import com.finflow.transaction_service.entity.Account;
import com.finflow.transaction_service.exception.DuplicateAccountException;
import com.finflow.transaction_service.mapper.AccountMapper;
import com.finflow.transaction_service.repository.AccountRepository;
import com.finflow.transaction_service.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	
	private final AccountRepository accountRepository;

	private AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}
	
	
	@Override
	public AccountResponse createAccount(CreateAccountRequest request) {
		  if (accountRepository.existsByAccountNumber(request.getAccountNumber())) {
			  throw new DuplicateAccountException(
				        "Account number " + request.getAccountNumber() + " already exists");
		    }

		    Account account = AccountMapper.toEntity(request);

		    Account savedAccount = accountRepository.save(account);

		    return AccountMapper.toResponse(savedAccount);

	}
	
	
	
	

}
