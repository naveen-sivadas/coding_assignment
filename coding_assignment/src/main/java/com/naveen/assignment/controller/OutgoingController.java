package com.naveen.assignment.controller;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.assignment.model.Outgoing;
import com.naveen.assignment.service.OutgoingService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Controller class for handling Outgoing requests. Any Outgoing requests should
 * be routed via this controller.
 * 
 * @author Naveen
 *
 */
@RestController
public class OutgoingController {
	@Autowired
	private OutgoingService outgoingService;

	@GetMapping("/outgoing/{id}")
	@ApiOperation(value = "Find Outgoing service by ID", notes = "Provide an ID to lookup resource", response = Outgoing.class)
	public Outgoing fetchOutgoing(
			@ApiParam(value = "ID of the resource you need to retrieve", required = true) @PathVariable("id") @NotBlank String id) {
		return outgoingService.fetchOutgoing(id).get();
	}
}
