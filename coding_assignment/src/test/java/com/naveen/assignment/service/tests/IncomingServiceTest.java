package com.naveen.assignment.service.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.naveen.assignment.model.Incoming;
import com.naveen.assignment.repository.IncomingRepository;
import com.naveen.assignment.repository.OutgoingRepository;
import com.naveen.assignment.service.IncomingService;
import com.naveen.assignment.service.OutgoingService;

/**
 * Tests related to IncomingService.
 * 
 * @author Naveen
 *
 */
@SpringBootTest
public class IncomingServiceTest {
	@Mock
	IncomingRepository incomingRepository;

	@Mock
	OutgoingRepository outgoingRepository;

	@InjectMocks
	IncomingService incomingService;

	@Mock
	OutgoingService outgoingService;
	
	private Incoming incoming;
	
	@BeforeEach
	public void setUp() {
		incoming = new Incoming();
		incoming.setId("123");
		incoming.setValidateMeOnlyIActuallyShouldBeABoolean(true);
	}

	/**
	 * Test the create method.
	 */
	@Test
	public void testCreate() {
		when(incomingRepository.save(ArgumentMatchers.any(Incoming.class))).thenReturn(incoming);
		Incoming incomingObj = incomingService.create(incoming);
		assertThat(incomingObj.getId()).isSameAs(incoming.getId());
		assertThat(incomingObj.isValidateMeOnlyIActuallyShouldBeABoolean()).isTrue();
	}
	
	/**
	 * Test the process method.
	 */
	@Test
	public void testProcess() {
		incomingService.process(incoming);
		Mockito.verify(outgoingService).saveOutgoing(ArgumentMatchers.any());
	}
}
