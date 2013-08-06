package com.example.authentication;

public class User {
	public String identity;
	public String firstname;
	public String lastname;
	public String email;
	
	public User(String identity, String firstname, String lastname, String email) {
		this.identity = identity;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
}
