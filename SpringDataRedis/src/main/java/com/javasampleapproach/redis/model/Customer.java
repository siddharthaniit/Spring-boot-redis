package com.javasampleapproach.redis.model;

import java.io.Serializable;

import javax.annotation.Generated;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Generated(value="id")
	private long id;
	private String firstName;
	private String lastName;

	protected Customer() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}