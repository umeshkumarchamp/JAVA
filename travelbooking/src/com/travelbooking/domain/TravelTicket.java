package com.travelbooking.domain;

public class TravelTicket {
	
	private long bookingRef; 
	private String origin; 
	private String destination; 
	private int price; 
	private String departureTime; 
	private String arrivalTime;

	
	public TravelTicket() {
	}


	public TravelTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime) {
		this.bookingRef = bookingRef;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}


	/**
	 * @return the bookingRef
	 */
	public long getBookingRef() {
		return bookingRef;
	}


	/**
	 * @param bookingRef the bookingRef to set
	 */
	public void setBookingRef(long bookingRef) {
		this.bookingRef = bookingRef;
	}


	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}


	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}


	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}


	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	public void cancel() {
		System.out.println("Your ticket cancel successfully.");
	}
	
	
	
	

}
