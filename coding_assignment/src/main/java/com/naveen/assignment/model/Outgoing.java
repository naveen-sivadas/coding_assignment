package com.naveen.assignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Document
@ApiModel(description = "Holds the Outgoing object information")
public class Outgoing {
	@ApiModelProperty(notes = "The ID for the Resourced to be fetched from the DB")
	@Id
	String id;

	@ApiModelProperty(notes = "The max value of the numbers")
	int numbersMeetNumbers;

	@ApiModelProperty(notes = "Duplicate characters if any")
	String findDuplicates;

	@ApiModelProperty(notes = "String value void of any duplicate characters")
	String whiteSpacesGalore;

	/**
	 * Constructor for Outgoing.
	 * 
	 * @param id
	 */
	public Outgoing(String id) {
		this.id = id;
	}

	/**
	 * Used to get the maximum value of the array elements.
	 * 
	 * @return - the max value.
	 */
	public int getNumbersMeetNumbers() {
		return numbersMeetNumbers;
	}

	/**
	 * Set the max value of the array elements.
	 * 
	 * @param numbersMeetNumbers - the max value.
	 */
	public void setNumbersMeetNumbers(int numbersMeetNumbers) {
		this.numbersMeetNumbers = numbersMeetNumbers;
	}

	/**
	 * Used to find and return any duplicates.
	 * 
	 * @return - the String value denoting the duplicate characters found.
	 */
	public String getFindDuplicates() {
		return findDuplicates;
	}

	/**
	 * Set the String with duplicate characters.
	 * 
	 * @param findDuplicates - duplicate characters.
	 */
	public void setFindDuplicates(String findDuplicates) {
		this.findDuplicates = findDuplicates;
	}

	/**
	 * Get the String value devoid of any whitespace characters.
	 * 
	 * @return String value without white spaces in between.
	 */
	public String getWhiteSpacesGalore() {
		return whiteSpacesGalore;
	}

	/**
	 * Set the String without whites paces.
	 * 
	 * @param whiteSpacesGalore String without white spaces.
	 */
	public void setWhiteSpacesGalore(String whiteSpacesGalore) {
		this.whiteSpacesGalore = whiteSpacesGalore;
	}
}
