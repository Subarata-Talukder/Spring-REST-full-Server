package com.subarata.springbootandrest.model;

public class Developer {

	private String name;
	private String designation;
	private String education;
	private String workingFields;
	private String message;
	
	public Developer(){
		
	}

	public Developer(String name, String designation, String education, String workingFields, String message) {
		super();
		this.name = name;
		this.designation = designation;
		this.education = education;
		this.workingFields = workingFields;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getWorkingFields() {
		return workingFields;
	}

	public void setWorkingFields(String workingFields) {
		this.workingFields = workingFields;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
