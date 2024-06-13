package com.krishana.KrishanaFlightBookingAgency.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishana.KrishanaFlightBookingAgency.Model.Passenger;
import com.krishana.KrishanaFlightBookingAgency.Model.PassengerResponce;
import com.krishana.KrishanaFlightBookingAgency.Service.PassengerServiceI;

@RestController
public class PassengerController {

	@Autowired
	private PassengerServiceI passengerServiceI;
	
	@PostMapping(value = "/save" , consumes = "application/json" ,produces = "application/json")
	public ResponseEntity<PassengerResponce> PassengerSave( @RequestBody Passenger passenger){
		PassengerResponce passengerSave = this.passengerServiceI.PassengerSave(passenger);
		
		return new ResponseEntity<PassengerResponce>( passengerSave , HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/booking2" ,consumes = "application/json" ,produces = "application/json")
	public ResponseEntity<PassengerResponce> flightBooking(@RequestBody Passenger passenger){
	PassengerResponce flightBooking = this.passengerServiceI.FlightBooking(passenger);
		return new ResponseEntity<>(flightBooking ,HttpStatus.CREATED);
		
	}
	
}
