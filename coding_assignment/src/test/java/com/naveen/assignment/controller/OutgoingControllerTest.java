package com.naveen.assignment.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.naveen.assignment.model.Outgoing;

@SpringBootTest
public class OutgoingControllerTest {
	@Autowired
	private OutgoingController controller;
	
	/**
	 * Test fetching of the outgoing object via the controller.
	 */
	@Test
	public void testFetchOutgoing() {
		Outgoing fetchOutgoing = controller.fetchOutgoing("222");
		assertThat(fetchOutgoing.getNumbersMeetNumbers()).isEqualTo(5);
		assertThat(fetchOutgoing.getWhiteSpacesGalore()).isEqualTo("helloworld");
		assertThat(fetchOutgoing.getFindDuplicates()).isEqualTo("a");
	}
}
