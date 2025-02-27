package com.image.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.image.binding.ExceptionInfo;

@RestControllerAdvice
public class AppExceptionHandler
{
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae) {
		ExceptionInfo exception = new ExceptionInfo();

		exception.setMsg(ae.getMessage());
		exception.setCode ("AIT0004");

		return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
