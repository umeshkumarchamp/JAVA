package February_09_02_23;
public class StringConcatenation {

	public static void main(String[] args) {
		/*
		    2.Write a method that takes a String[] as an argument and 
		    returns a String containing the concatenation of all the 
		    strings in the input array. Invoke your method 3 times 
		    with different arguments. Make sure that your code 
		    handles the cases where the argument is null.
		 */
		
		String[] str = {"umesh","kumar","champ"}; 
		
		System.out.println("Before Concatenation : ");
		for(int i=0 ; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("\nAfter Concatenation : ");
		String mystr = Concatenation(str); 
		System.out.println(mystr);
	}
	
	static String Concatenation(String arr[]) {
		
		String str = arr[0].concat(arr[1].concat(arr[2])); 
		
		return str; 
	}

}


/*
 OUTPUT : 
 
    Before Concatenation : 
	umesh
	kumar
	champ
	
	After Concatenation : 
	umeshkumarchamp


*/
