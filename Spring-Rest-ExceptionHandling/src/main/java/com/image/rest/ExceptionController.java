package com.image.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.image.binding.ExceptionInfo;

@RestController
public class ExceptionController
{
	private Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	
	@GetMapping("/")
	public String getEvent()
	{
		String msg =  "welcome aamir";
		
		try {
			int i = 10/0;
		} catch (Exception e) {
			logger.info("Exception Occured ::"+ e,e);
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
		
	}
	
	
	

}
