package February_09_02_23;

public class ArrayValues {

	public static void main(String[] args) {
		/*
		    3.Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and Cathy, 
		    and another one containing int values: 15,9, 14, 10,and 12.  create an table showing 
		     these values as name value pairs as below.

					Name       Value
					Amy			9
					Boyd		10
					Cathy		12
					John		14
					Peter		15
		*/
		
		String str[] = {"Peter","Amy","John","Baby","Cathy"}; 
		int arr[] = {15,19,14,10,12}; 
		System.out.println("Name\tValue");
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i] +"\t"+arr[i]);
		}
		

	}

}
/*
OUTPUT : 

	Name	Value
	Peter	15
	Amy	19
	John	14
	Baby	10
	Cathy	12
  
  
*/
