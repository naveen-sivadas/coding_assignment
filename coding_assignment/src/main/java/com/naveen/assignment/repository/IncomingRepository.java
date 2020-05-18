package com.naveen.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.naveen.assignment.model.Incoming;

@Repository
public interface IncomingRepository extends MongoRepository<Incoming, String> {
	/**
	 * Any custom changes for persisting in the DB can be handled here.
	 */
}
