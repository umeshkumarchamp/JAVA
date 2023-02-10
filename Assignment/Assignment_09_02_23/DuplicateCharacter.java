package February_09_02_23;
import java.util.Scanner;
public class DuplicateCharacter {

	public static void main(String[] args) {
		/*
		   Q4. Make a method that accepts a String from user
		    and print all Duplicate character which belongs to that String.
		    
		 */
		
		
		getString();

	}
	
	static void getString() {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		//String str = "UmeshU"; 
		int count=0; 
		for(int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i));
			count = 0; 
			for(int c=i; c<str.length(); c++) 
			{
				if(str.charAt(i) == str.charAt(c)) 
				{ 
					count++; 
				}
			}
			if(count == 2 ) 
			{
				
				System.out.println("Duplicate Character : "+ str.charAt(i));
			}
			
		}
		
	}

}
