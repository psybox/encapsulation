package org.feiler.encapsulation;

public class Person {
	
	private String name;
	private String officeAreaCode;
	private String officeNumber;

	public Person(String name, String officeAreaCode, String officeNumber) {

		this.name = name;
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}	

	public String getOfficeAreaCode() {
		return this.officeAreaCode;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}	

	public String getOfficeNumber() {
		return this.officeNumber;
	}

	public String getTelephoneNumber() {
		return this.officeAreaCode + " " + this.officeNumber;
	}

	public String toString() {
		return this.name + ":" + this.getTelephoneNumber();
	}
 }
