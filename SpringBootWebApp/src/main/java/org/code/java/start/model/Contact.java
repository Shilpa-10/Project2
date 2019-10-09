package org.code.java.start.model;

public class Contact {

	private String name1;
	private String email;
	private String country;

	public Contact(String name1, String email, String country) {
		super();
		this.name1 = name1;
		this.email = email;
		this.country = country;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
