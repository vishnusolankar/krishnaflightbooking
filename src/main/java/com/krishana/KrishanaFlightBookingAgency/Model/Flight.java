package com.krishana.KrishanaFlightBookingAgency.Model;

import java.util.Date;




public class Flight {

private int flightId;
	
	private String flightname;
	
	private String flightPickupLocation;
	
	private String flightDropLocation;
	
	private double flightPrice;
	
	private double flightTime;
	
	private Date date;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getFlightPickupLocation() {
		return flightPickupLocation;
	}

	public void setFlightPickupLocation(String flightPickupLocation) {
		this.flightPickupLocation = flightPickupLocation;
	}

	public String getFlightDropLocation() {
		return flightDropLocation;
	}

	public void setFlightDropLocation(String flightDropLocation) {
		this.flightDropLocation = flightDropLocation;
	}

	public double getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}

	public double getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightname=" + flightname + ", flightPickupLocation="
				+ flightPickupLocation + ", flightDropLocation=" + flightDropLocation + ", flightPrice=" + flightPrice
				+ ", flightTime=" + flightTime + ", date=" + date + "]";
	}

	
}
