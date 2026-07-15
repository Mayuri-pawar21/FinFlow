package com.finflow.transaction_service.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	  @ExceptionHandler(DuplicateAccountException.class)
	    public ResponseEntity<ErrorResponse> handleDuplicateAccountException(
	            DuplicateAccountException ex) {

	        ErrorResponse errorResponse = new ErrorResponse(
	                LocalDateTime.now(),
	                HttpStatus.CONFLICT.value(),
	                "Duplicate Account",
	                ex.getMessage());

	        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
}
}
