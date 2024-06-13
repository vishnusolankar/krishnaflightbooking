package com.krishana.KrishanaFlightBookingAgency.Service;

import com.krishana.KrishanaFlightBookingAgency.Model.Passenger;
import com.krishana.KrishanaFlightBookingAgency.Model.PassengerResponce;

public interface PassengerServiceI {

	public PassengerResponce  PassengerSave(Passenger passenger);
	
	
	
	public PassengerResponce FlightBooking(Passenger passenger);
}
