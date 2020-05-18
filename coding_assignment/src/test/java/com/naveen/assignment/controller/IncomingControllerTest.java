package com.naveen.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.naveen.assignment.model.Incoming;

@SpringBootTest
public class IncomingControllerTest {
	@Autowired
	private IncomingController controller;
	
	/**
	 * Test the API for creating an Incoming resource.
	 */
	@Test
	public void createTest() {
		Incoming incomingObject = new Incoming();
		incomingObject.setId("222");
		incomingObject.setFindDuplicates("abea");
		incomingObject.setValidateMeOnlyIActuallyShouldBeABoolean(true);
		incomingObject.setWhiteSpacesGalore("hello world");
		incomingObject.setNumbersMeetNumbers(new int[] {1,2,5,3});
		ResponseEntity<String> create = controller.create(incomingObject);
		assertThat(create.getStatusCodeValue()).isEqualTo(200);
	}
	
	@Test
	/**
	 * Test API by providing an invalid input.
	 */
	public void createInvalidTest() {
		Incoming incomingObject = new Incoming();
		ResponseEntity<String> create = controller.create(incomingObject);
		assertThat(create.getStatusCodeValue()).isEqualTo(400);
	}
	
	@Test
	/**
	 * Test API by providing an invalid input.
	 */
	public void createInvalidWhiteSpacesTest() {
		Incoming incomingObject = new Incoming();
		incomingObject.setId("222");
		incomingObject.setFindDuplicates("abea");
		incomingObject.setValidateMeOnlyIActuallyShouldBeABoolean(true);
		ResponseEntity<String> create = controller.create(incomingObject);
		assertThat(create.getStatusCodeValue()).isEqualTo(400);
	}
}
