package com.naveen.assignment.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.naveen.assignment.model.Incoming;
import com.naveen.assignment.model.Outgoing;
import com.naveen.assignment.repository.OutgoingRepository;

@Service
public class OutgoingService {

	@Autowired
	private OutgoingRepository outgoingRepository;

	public void saveOutgoing(Incoming incoming) {
		Outgoing outgoing = new Outgoing(incoming.getId());
		outgoing.setFindDuplicates(findDuplicateCharacters(incoming.getFindDuplicates()));
		outgoing.setWhiteSpacesGalore(stripWhiteSpaces(incoming.getWhiteSpacesGalore()));
		outgoing.setNumbersMeetNumbers(findMaxValue(incoming.getNumbersMeetNumbers()));
		outgoingRepository.save(outgoing);
	}

	/**
	 * Used to fetch the outgoing resource based on the ID passed.
	 * 
	 * @param id the ID for the outgoing resource to be fetched.
	 * @return the outgoing object.
	 */
	public Optional<Outgoing> fetchOutgoing(String id) {
		return outgoingRepository.findById(id);
	}

	private String stripWhiteSpaces(String rawInput) {
		if(StringUtils.isEmpty(rawInput)) {
			throw new IllegalArgumentException("Invalid data for raw white spaces input");
		}
		return rawInput.chars().filter(e -> !Character.isWhitespace(e))
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	private String findDuplicateCharacters(String rawInput) {
		if(StringUtils.isEmpty(rawInput)) {
			throw new IllegalArgumentException("Invalid data for raw duplicate input");
		}
		
		Set<Character> set = new HashSet<Character>();
		return rawInput.chars().filter(e -> !set.add((char) e))
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	private int findMaxValue(int[] inputArray) {
		return IntStream.of(inputArray).boxed().reduce(Integer::max).get();
	}

}
