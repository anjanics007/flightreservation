package RestfulWebServices.restfulwebservices.entity;

import java.time.LocalDateTime;

public class Flight {
	
	String flightName;
	
	int flightNumber;
	
	LocalDateTime flightArrivalTime;
	
	LocalDateTime flightDeptureTime;
	
	String From;
	
	String TO;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalDateTime getFlightArrivalTime() {
		return flightArrivalTime;
	}

	public void setFlightArrivalTime(LocalDateTime flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}

	public LocalDateTime getFlightDeptureTime() {
		return flightDeptureTime;
	}

	public void setFlightDeptureTime(LocalDateTime flightDeptureTime) {
		this.flightDeptureTime = flightDeptureTime;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getTO() {
		return TO;
	}

	public void setTO(String tO) {
		TO = tO;
	}

}
