package com.krishana.KrishanaFlightBookingAgency.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.krishana.KrishanaFlightBookingAgency.Model.Flight;
import com.krishana.KrishanaFlightBookingAgency.Model.Passenger;
import com.krishana.KrishanaFlightBookingAgency.Model.PassengerResponce;
import com.krishana.KrishanaFlightBookingAgency.Repository.PassengerRepository;
import com.krishana.KrishanaFlightBookingAgency.Service.PassengerServiceI;

import reactor.core.Disposable;

@Service
public class PassengerServiceImpl implements PassengerServiceI{

	@Autowired
	private PassengerRepository passengerRepository;
	
	@Override
	public PassengerResponce PassengerSave(Passenger passenger) {

		Passenger passengerdata = this.passengerRepository.save(passenger);
		int passengerid = passengerdata.getPassengerid();
		if(passengerdata !=null) {
			PassengerResponce p =new PassengerResponce();
			p.setPassengerid(passengerid);
			p.setPassengerStatus("Ticket Confirmed");
			p.setTicketAmount("4000");
			return p ;
		}else{
			
			
			return null ;
		}
		
		
	}

	@Override
	public PassengerResponce FlightBooking(Passenger passenger) {
		
		WebClient create = WebClient.create();
		String url ="http://localhost:9090/booking";
		 Disposable subscribe = create.post().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Flight.class).collectList().subscribe(System.out::println);
		return (PassengerResponce) subscribe ;
		
	
		
	}
	

		
			
		

}
