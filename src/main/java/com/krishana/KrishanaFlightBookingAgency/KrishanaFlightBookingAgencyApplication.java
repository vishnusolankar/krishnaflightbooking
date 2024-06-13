package com.krishana.KrishanaFlightBookingAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.krishana.KrishanaFlightBookingAgency.Service.KrishanaFlightBookingServiceI;

@SpringBootApplication
public class KrishanaFlightBookingAgencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KrishanaFlightBookingAgencyApplication.class, args);
		//KrishanaFlightBookingServiceI serviceI = context.getBean(KrishanaFlightBookingServiceI.class);
		//serviceI.getAllFlightAsycnData();
		//serviceI.getAllFlightSyncData();
		//serviceI.getAllFlightData();
	}

}
