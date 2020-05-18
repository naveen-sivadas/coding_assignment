package com.naveen.assignment.controller;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.assignment.model.Incoming;
import com.naveen.assignment.service.IncomingService;

/**
 * Controller used for handling incoming requests. Any incoming service related
 * API to mapped to this controller.
 * TODO - ObjectMapper to be implemented for strict type validation.
 */
@RestController
@RequestMapping("/")
public class IncomingController {

	@Autowired
	private IncomingService incomingService;

	@PostMapping("/incoming")
	public ResponseEntity<String> create(@Valid @RequestBody Incoming incoming) {
		try {
		// Creates and persists the Incoming data.
		Incoming incomingData = incomingService.create(incoming);
		// Process the Incoming data viz. to check for duplicates, remove whitespace
		// characters and find max value.
		incomingService.process(incomingData);
		}catch(IllegalArgumentException e) {
			LoggerFactory.getLogger(getClass()).error("Error during execution",e);
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok("Incoming request successfully processed");
	}
}
