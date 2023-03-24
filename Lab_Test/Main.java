package Lab_Test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int choice = 0; 
		
		System.out.println("\n***** JAVA DATABASE CONNECTIVITY *****\n ");
		do {
			System.out.print("Enter 1 to Add Record : \n"
					+ "Enter 2 to Update Record...\n"
					+ "Enter 3 to Search a User...\n"
					+ "Enter 4 to Exit...\n"
					+ "\nEnter Your Choice : ");
			choice = sc.nextInt();
			sc.nextLine(); 
			
			switch(choice) {
			case 1:
				System.out.println("\n***** Adding new Record *****");
				System.out.print("\nEnter Username : ");
				String user = sc.nextLine(); 
				System.out.print("\nEnter Password : ");
				String pass = sc.nextLine(); 
				Company.addRecord(user, pass);
				System.out.println("\n");
				break; 
			case 2:
				System.out.println("\n***** Update a Record *****");
				System.out.print("\nEnter Username : ");
				user = sc.nextLine(); 
				System.out.print("\nEnter Password : ");
				pass = sc.nextLine(); 
				Company.updateRecord(user, pass);
				System.out.println("\n");
				break; 
			case 3:
				System.out.println("\n***** Search a Record By Username ***** ");
				System.out.print("\nEnter Username : ");
				user = sc.nextLine(); 
				Company.searchRecord(user);		
				System.out.println("\n");
				break;
			case 4:
				System.exit(0);
				break; 
			default :
				System.out.println("Invalid Choice !!!!");
				break; 
			}
			
			
		}while(choice !=4); 
		
		sc.close(); 
		
	}

}
