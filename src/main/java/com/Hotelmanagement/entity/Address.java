package com.Hotelmanagement.entity;

import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Address extends CommonClass {

	private String street;
	private String city;
	private String state;
	private String pin;

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	public Address(String street, String city, String state, String pin) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
