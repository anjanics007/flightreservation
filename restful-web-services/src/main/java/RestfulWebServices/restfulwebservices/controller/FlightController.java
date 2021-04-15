package RestfulWebServices.restfulwebservices.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulWebServices.restfulwebservices.entity.Flight;

@RestController
@RequestMapping("/Flight")
public class FlightController {
	
	@PostMapping("/createFlight")
	public Flight createFlight(Flight flight)
	{
		Flight flightobj = new Flight();
		
		flightobj.setFlightName("Air India");
		flightobj.setFlightNumber(232);
		
		LocalDateTime datetime1 = LocalDateTime.of(2021, 4, 14, 9, 45);  
		
		flightobj.setFlightArrivalTime(datetime1);
		
		LocalDateTime datetime2 = LocalDateTime.of(2021, 4, 15, 9, 45);  

		
		flightobj.setFlightDeptureTime(datetime2);
		flightobj.setFrom("Bangalore");
		flightobj.setTO("Delhi");
		return flightobj;
		
	}
	
	@GetMapping("/getAllFlight")
	public List<Flight> getFlight()
	{
		
		List<Flight> listobj = new ArrayList<Flight>();
		Flight flightobj=new Flight();
		
		flightobj.setFlightName("Air India");
		flightobj.setFlightNumber(232);
		
		LocalDateTime datetime1 = LocalDateTime.of(2021, 4, 14, 9, 45); 
		
		flightobj.setFlightArrivalTime(datetime1);
		
		LocalDateTime datetime2 = LocalDateTime.of(2021, 4, 15, 9, 45);  
		
		flightobj.setFlightDeptureTime(datetime2);
		flightobj.setFrom("Bangalore");
		flightobj.setTO("Delhi");
		listobj.add(flightobj);		
		return listobj;
		
	}

}
