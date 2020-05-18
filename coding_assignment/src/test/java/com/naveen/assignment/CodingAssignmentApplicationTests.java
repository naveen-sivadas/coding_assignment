package com.naveen.assignment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.naveen.assignment.controller.IncomingController;

@SpringBootTest
class CodingAssignmentApplicationTests {
	@Autowired
	private IncomingController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	/**
	 * Test main.
	 */
	void testMain() {
		CodingAssignmentApplication.main(new String[] {});
	}

}
