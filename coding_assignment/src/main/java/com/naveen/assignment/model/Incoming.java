package com.naveen.assignment.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Document
@ApiModel(description = "Holds the Incoming request / mapped JSON object")
public class Incoming {
	@ApiModelProperty(notes = "The ID for the Request")
	@NotNull(message = "ID is required")
	@Id
	String id;

	@ApiModelProperty(notes = "String with duplicated characters")
	@NotNull(message = "findDuplicates is required")
	String findDuplicates;

	@ApiModelProperty(notes = "String with whitespace characters")
	@NotNull(message = "whiteSpacesGalore is required")
	String whiteSpacesGalore;

	@ApiModelProperty(notes = "Boolean field for validation")
	@NotNull(message = "validateMeOnlyIActuallyShouldBeABoolean is required")
	boolean validateMeOnlyIActuallyShouldBeABoolean;

	@ApiModelProperty(notes = "Array of integers")
	@NotNull(message = "numbersMeetNumbers is required")
	int[] numbersMeetNumbers;

	/**
	 * Used to get the array of integer values.
	 * 
	 * @return array of integers.
	 */
	public int[] getNumbersMeetNumbers() {
		return numbersMeetNumbers;
	}

	/**
	 * Set the array of integers.
	 * 
	 * @param numbersMeetNumbers int array.
	 */
	public void setNumbersMeetNumbers(int[] numbersMeetNumbers) {
		this.numbersMeetNumbers = numbersMeetNumbers;
	}

	/**
	 * Used to get the id.
	 * 
	 * @return String id value.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Used to set the id value.
	 * 
	 * @param id id for the requested value.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Used to get the String with duplicate characters in it.
	 * 
	 * @return String with duplicate values.
	 */
	public String getFindDuplicates() {
		return findDuplicates;
	}

	/**
	 * Set the String value with duplicate characters in it.
	 * 
	 * @param findDuplicates
	 */
	public void setFindDuplicates(String findDuplicates) {
		this.findDuplicates = findDuplicates;
	}

	/**
	 * Get the string with white space characters in between.
	 * 
	 * @return String with white characters.
	 */
	public String getWhiteSpacesGalore() {
		return whiteSpacesGalore;
	}

	/**
	 * Used to set the text with white characters in it.
	 * 
	 * @param whiteSpacesGalore text with white characters.
	 */
	public void setWhiteSpacesGalore(String whiteSpacesGalore) {
		this.whiteSpacesGalore = whiteSpacesGalore;
	}

	/**
	 * Holds a boolean value for validation.
	 * 
	 * @return boolean.
	 */
	public boolean isValidateMeOnlyIActuallyShouldBeABoolean() {
		return validateMeOnlyIActuallyShouldBeABoolean;
	}

	/**
	 * Returns the boolean value.
	 * 
	 * @param validateMeOnlyIActuallyShouldBeABoolean
	 */
	public void setValidateMeOnlyIActuallyShouldBeABoolean(boolean validateMeOnlyIActuallyShouldBeABoolean) {
		this.validateMeOnlyIActuallyShouldBeABoolean = validateMeOnlyIActuallyShouldBeABoolean;
	}

}
