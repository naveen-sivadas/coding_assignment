package com.naveen.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.assignment.model.Incoming;
import com.naveen.assignment.repository.IncomingRepository;

@Service
public class IncomingService {

	@Autowired
	private IncomingRepository incomingRepository;

	@Autowired
	private OutgoingService outgoingService;

	/**
	 * Used to create an Incoming collection.
	 * 
	 * @param incoming - the Incoming object JSON object.
	 * @return Incoming object.
	 */
	public Incoming create(Incoming incoming) {
		return incomingRepository.save(incoming);
	}

	/**
	 * Used to process the data from the Incoming object to be processed and
	 * persisted as an Outgoing resource.
	 * 
	 * @param incoming Incoming object.
	 */
	public void process(Incoming incoming) {
		outgoingService.saveOutgoing(incoming);
	}
}
