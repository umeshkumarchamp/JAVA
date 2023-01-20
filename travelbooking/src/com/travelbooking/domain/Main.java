package com.travelbooking.domain;

//import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// Travel Booking System.
		
		System.out.println("\n ***** T R A V E L    B O O K I N G    S Y S T E M ***** \n");
		
		TrainTicket trainTicket1 = new TrainTicket(1234,"Ranchi","Mumbai",5000,"02:00 pm","10:00 am",1,101,23);
		
		
		trainTicket1.TicketDetails(); 
		
		//trainTicket1.upgrade();
		
		System.out.println();
		
		PlaneTicket pt1 = new PlaneTicket(1234,"Kolkata","Ranchi",5000,"05:00 PM","10:00 AM",78384729,3482653,"04:00 PM");
		
		pt1.display();
		
		System.out.println();
		
		BusTicket bt1 = new BusTicket(13445,"Goa","Ranchi",5000,"10:00 PM","09:00 AM",923452342,723434);
		
		bt1.BusTicketDetails();
		
		
		
		

	}

}
