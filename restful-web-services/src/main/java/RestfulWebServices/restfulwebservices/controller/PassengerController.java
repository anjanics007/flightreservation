package RestfulWebServices.restfulwebservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulWebServices.restfulwebservices.entity.Passenger;

@RestController
@RequestMapping("/Passenger")
public class PassengerController {
	
	
	@PostMapping("/create")
	public Passenger createPassenger(Passenger passenger)
	{
		passenger.setId(1);
		passenger.setName("abc");
		passenger.setPhone(12345678);
		passenger.setAddress("xyz");
		passenger.setGender("Male");
		List<Passenger> passengerlist= new ArrayList<Passenger>();		
		passengerlist.add(passenger);		
		return passenger;		
	}
	
	@GetMapping("/getAll")
	public Passenger getPassenger()
	{
		Passenger passenger = new Passenger();
		passenger.setId(1);
		passenger.setName("abc");
		passenger.setPhone(12345678);
		passenger.setAddress("xyz");
		passenger.setGender("Male");
		List<Passenger> passengerlist= new ArrayList<Passenger>();		
		passengerlist.add(passenger);		
		return passenger;
	}
	

}
