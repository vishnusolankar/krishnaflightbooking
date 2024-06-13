package com.krishana.KrishanaFlightBookingAgency.ServiceImpl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.krishana.KrishanaFlightBookingAgency.Model.Flight;
import com.krishana.KrishanaFlightBookingAgency.Service.KrishanaFlightBookingServiceI;

import reactor.core.Disposable;

@Service
public class KrishanaFlightBookingServiceImpl implements KrishanaFlightBookingServiceI{

	@Override
	public void getAllFlightData() {
		RestTemplate rest =new RestTemplate();
		String url ="http://localhost:9090/Information";
		ResponseEntity<Flight> forEntity = rest.getForEntity(url, Flight.class);
		Flight body = forEntity.getBody();
		System.out.println(body);
		
		
	}

	@Override
	public void getAllFlightSyncData() {
		
		WebClient web = WebClient.create();
		String url ="http://localhost:9090/Information";
		Flight block = web.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Flight.class).blockFirst();
		System.out.println(block);
		System.out.println("Welcome to India");
	}

	@Override
	public void getAllFlightAsycnData() {
	
		WebClient web = WebClient.create();
		String url ="http://localhost:9090/Information";
		  Disposable subscribe = web.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Flight.class).subscribe(System.out::println);
		System.out.println(subscribe);
		System.out.println("Welcome to India");
	}

}
