package com.travelbooking.domain;

public class PlaneTicket extends TravelTicket {

	private long pnrCode;
	private long bookingCode;
	private String boardingTime;
	
	
	
	public PlaneTicket() {
		super();

	}

	public PlaneTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime, long pnrCode, long bookingCode, String boardingTime) {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		this.pnrCode = pnrCode;
		this.bookingCode = bookingCode;
		this.boardingTime = boardingTime;
	}

	public long getPnrCode() {
		return pnrCode;
	}

	public void setPnrCode(long pnrCode) {
		this.pnrCode = pnrCode;
	}

	public long getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(long bookingCode) {
		this.bookingCode = bookingCode;
	}

	public String getBoardingTime() {
		return boardingTime;
	}

	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	
	
	
	
	public void display() {
		System.out.println("\n ***** Your Plane Ticket Details ***** \n ");
		System.out.println("Booking Reference : "+getBookingRef());
		System.out.println("Your Origin : "+getOrigin());
		System.out.println("Your Destination : "+getDestination()); 
		System.out.println("Ticket Price : "+getPrice());
		System.out.println("Arrival Time : "+getArrivalTime()); 
		System.out.println("Departure Time : "+getDepartureTime()); 
		System.out.println("PNR Code : "+getPnrCode());
		System.out.println("Booking Code : "+getBookingCode()); 
		System.out.println("Boarding Time : "+getBoardingTime());
		
		
	}
	
	
	
	
	
	
	
	
	
}
