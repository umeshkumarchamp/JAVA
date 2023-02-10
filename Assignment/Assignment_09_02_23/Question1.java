package February_09_02_23;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		/*
		  1.Write a method that takes a String and returns a String of the same length
		   containing the 'X' character in all positions except the last 4 positions. 
		   The characters in the last 4 positions must be the same as in the original
		    string. For example, if the argument is
			"12345678", the return value should be "XXXX5678".

		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Phone Number : ");
		String num = sc.nextLine(); 
		String rtn = myString(num);
		System.out.println("Your number is : "+ rtn);
 
		sc.close();
	}

	static String myString(String pass) {
		 char[] ch = pass.toCharArray(); 
		for(int i=0; i<pass.length()-4; i++)
		{
			ch[i] = 'x'; 
		}
		pass = String.valueOf(ch);				
		return pass; 
	}
	

}

/*
OUTPUT : 

    Enter Your Phone Number : 6201033951
	Your number is : xxxxxx3951
    
 */
