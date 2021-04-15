package RestfulWebServices.restfulwebservices.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulWebServices.restfulwebservices.entity.BookingDetail;
import RestfulWebServices.restfulwebservices.entity.Flight;
import RestfulWebServices.restfulwebservices.entity.Passenger;



@RestController
@RequestMapping("/BookingDetail")
public class BookingDetailController {
	
	
	@PostMapping("/createbooking")
	public List<BookingDetail> createbooking(BookingDetail booking)
	{
		
		List<Flight>  flightlist = new ArrayList<>();		
		Flight flight = new Flight();
	     		flight.setFlightNumber(12345);
	     		
	     		flightlist.add(flight);
	     		
		Passenger passenger = new Passenger();
		        passenger.setId(1);
		        
		        Passenger passenger1 = new Passenger();
		        passenger.setId(2);
		
		flight.getFlightNumber();
		flight.getFlightName();
		
		
		passenger.getId();
		passenger.getName();
		
		
		BookingDetail bookingdetail = new BookingDetail();
		bookingdetail.setBookingId(1);
		bookingdetail.setFlight(flight);
		bookingdetail.setPassenger(passenger);
		
		BookingDetail bookingdetail1 = new BookingDetail();
		bookingdetail1.setBookingId(2);
		bookingdetail1.setFlight(flight);
		bookingdetail1.setPassenger(passenger1);
		
		
		
		LocalDateTime datetime1 = LocalDateTime.of(2021, 3, 11, 9, 45);  
		
		bookingdetail.setBookingDate(datetime1);

		List<BookingDetail> listbookdetail = new ArrayList<>();
		listbookdetail.add(bookingdetail1);
		listbookdetail.add(bookingdetail);
		
		return listbookdetail;
		
		
	}
		
		@GetMapping("/getbooking")
		public List<BookingDetail> getbooking(BookingDetail booking)
		{
			
			List<Flight>  flightlist = new ArrayList<>();		
			Flight flight = new Flight();
		     		flight.setFlightNumber(12345);
		     		
		     		flightlist.add(flight);
		     		
			Passenger passenger = new Passenger();
			        passenger.setId(1);
			        passenger.setName("xyz");
			        
			        Passenger passenger1 = new Passenger();
			        passenger1.setId(2);
			        passenger1.setName("abc");
			
			flight.getFlightNumber();
			flight.getFlightName();
			
			
			passenger.getId();
			passenger.getName();
			
			
			BookingDetail bookingdetail = new BookingDetail();
			bookingdetail.setBookingId(1);
			bookingdetail.setFlight(flight);
			bookingdetail.setPassenger(passenger);
			
			BookingDetail bookingdetail1 = new BookingDetail();
			bookingdetail1.setBookingId(2);
			bookingdetail1.setFlight(flight);
			bookingdetail1.setPassenger(passenger1);
			
			
			
			LocalDateTime datetime1 = LocalDateTime.of(2021, 3, 11, 9, 45);  
			
			bookingdetail.setBookingDate(datetime1);

			List<BookingDetail> listbookdetail = new ArrayList<>();
			listbookdetail.add(bookingdetail1);
			listbookdetail.add(bookingdetail);
			
			return listbookdetail;
		
	}

}
