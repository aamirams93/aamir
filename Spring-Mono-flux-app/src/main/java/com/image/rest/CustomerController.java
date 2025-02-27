package com.image.rest;

import org.springframework.web.bind.annotation.RestController;

import com.image.binding.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CustomerController
{
	@GetMapping(value = "/event", produces = "application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent()
	{
		CustomerEvent cs = new CustomerEvent("Aamir", new Date());
		Mono<CustomerEvent> customerMono = Mono.just(cs);
		return new ResponseEntity<Mono<CustomerEvent>>(customerMono, HttpStatus.OK);
	}

	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvents()
	{
		// creating binding object with data
		CustomerEvent cs = new CustomerEvent("Aamir", new Date());
		
		// creating stream for binding object
		Stream<CustomerEvent> customerStream = Stream.generate(() -> cs);

		// create flux object using stream
		Flux<CustomerEvent> customerFlux = Flux.fromStream(customerStream);
		
		// setting response interval
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));
		
		// combine interval flux and customer event flux
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(interval, customerFlux);
		
		// Getting Tuple value as T2
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		
		//sending response
		return new ResponseEntity<>(fluxMap,HttpStatus.OK);
		
		
		
		

	}

}
