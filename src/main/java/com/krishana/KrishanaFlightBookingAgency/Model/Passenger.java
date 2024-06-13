package com.krishana.KrishanaFlightBookingAgency.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerid;
	
	private String passengername;
	
	private long passengerMobileNumber;
	
	private String form;
	
	private String to;

	public int getPassengerid() {
		return passengerid;
	}

	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public long getPassengerMobileNumber() {
		return passengerMobileNumber;
	}

	public void setPassengerMobileNumber(long passengerMobileNumber) {
		this.passengerMobileNumber = passengerMobileNumber;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Passenger [passengerid=" + passengerid + ", passengername=" + passengername + ", passengerMobileNumber="
				+ passengerMobileNumber + ", form=" + form + ", to=" + to + "]";
	}
	
	
}
