package com.isl.versioning;

public class Name {
	private String firstName;
	private String lastName;
	public Name() {
	  }

public Name(String firstName,String lastName)
{
	super();
	this.setFirstName(firstName);
	this.setLastName(lastName);
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
	
}
