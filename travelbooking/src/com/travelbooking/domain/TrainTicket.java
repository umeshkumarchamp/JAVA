package com.travelbooking.domain;


public class TrainTicket extends TravelTicket {
	
	private int travelClass; 
	private int carriageNumber; 
	private int seatNumber;
	
	// default constructor... 
	public TrainTicket() {
		super(); 
	}
	
	public TrainTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime, int travelClass, int carriageNumber, int seatNumber) {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		// super - it use parent class constructor 
		this.travelClass = travelClass;
		this.carriageNumber = carriageNumber;
		this.seatNumber = seatNumber;
	}
	/**
	 * @return the travelClass
	 */
	public int getTravelClass() {
		return travelClass;
	}
	/**
	 * @param travelClass the travelClass to set
	 */
	public void setTravelClass(int travelClass) {
		this.travelClass = travelClass;
	}
	/**
	 * @return the carriageNumber
	 */
	public int getCarriageNumber() {
		return carriageNumber;
	}
	/**
	 * @param carriageNumber the carriageNumber to set
	 */
	public void setCarriageNumber(int carriageNumber) {
		this.carriageNumber = carriageNumber;
	}
	/**
	 * @return the seatNumber
	 */
	public int getSeatNumber() {
		return seatNumber;
	}
	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
		
	
	public void upgrade() {
		if(travelClass != 1) {
			travelClass = 1; 
			System.out.println("You have been upgraded.");
		}
		else {
			System.out.println("You are already in first class.");
		}
	}
	
	@Override
	public void cancel() {
		System.out.println("Your Ticket got canceling");
	}
	
	
	
	public void TicketDetails() {
		System.out.println("\n***** Train Ticket Details ****\n ");
		System.out.println("Booking Reference : "+getBookingRef());
		System.out.println("Your Origin : "+getOrigin());
		System.out.println("Your Destination : "+getDestination()); 
		System.out.println("Ticket Price : "+getPrice());
		System.out.println("Arrival Time : "+getArrivalTime()); 
		System.out.println("Departure Time : "+getDepartureTime()); 
		System.out.println("Travel Class : "+getTravelClass()); 
		System.out.println("Carriage Number : "+getCarriageNumber()); 
		System.out.println("Seat Number : "+getSeatNumber()); 
	}
	
	
	
	

}
