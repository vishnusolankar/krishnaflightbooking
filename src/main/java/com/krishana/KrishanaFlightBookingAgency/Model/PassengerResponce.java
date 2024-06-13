package com.krishana.KrishanaFlightBookingAgency.Model;

public class PassengerResponce {

	private int passengerid;
	
	private String passengerStatus;
	
	private String ticketAmount;

	public int getPassengerid() {
		return passengerid;
	}

	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}

	public String getPassengerStatus() {
		return passengerStatus;
	}

	public void setPassengerStatus(String passengerStatus) {
		this.passengerStatus = passengerStatus;
	}

	public String getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(String ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	@Override
	public String toString() {
		return "PassengerResponce [passengerid=" + passengerid + ", passengerStatus=" + passengerStatus
				+ ", ticketAmount=" + ticketAmount + "]";
	}
	
	
}
