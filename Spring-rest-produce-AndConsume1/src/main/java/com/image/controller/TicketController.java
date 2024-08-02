package com.image.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.image.bindings.PassengerInfo;
import com.image.bindings.TicketInfo;

@RestController
public class TicketController
{
	@PostMapping(value = "/ticket",produces = {"application/json"},consumes = {"application/json"})
	public ResponseEntity<TicketInfo>bookTicket(@RequestBody PassengerInfo request)
	{
		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(1);
		tinfo.setPnrNo("123456");
		tinfo.setTicketStatus("Confirm");
		
		return new ResponseEntity<>(tinfo,HttpStatus.CREATED);
	}
	

	@PutMapping(value = "/ticket",produces = {"application/json"},consumes = {"application/json"})
	public ResponseEntity<String>updateTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
		return new ResponseEntity<>("ticket Updated",HttpStatus.OK);
	}
	

	@DeleteMapping(value = "/ticket/{ticketId}")
	public ResponseEntity<String>deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		System.out.println(ticketId);
		return new ResponseEntity<String>("ticket delete",HttpStatus.OK);
	}
	
	

}
