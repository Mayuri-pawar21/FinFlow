package com.finflow.transaction_service.service;

import com.finflow.transaction_service.dto.request.CreateAccountRequest;
import com.finflow.transaction_service.dto.response.AccountResponse;

public interface AccountService {

	 AccountResponse createAccount(CreateAccountRequest request);

}
