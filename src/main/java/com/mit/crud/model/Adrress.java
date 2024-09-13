package com.mit.crud.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adrress {
	private String city;
	private int pin;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
