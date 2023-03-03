package LAMBDA;

interface ArrayGenerater {
	
	void myMethod(int arr[], int k); 
}

@FunctionalInterface
interface LengthInter{
	int getLength(int arr[]);
}
public class Question {

	public static void main(String[] args) {
		// WAP to generate an array by multiplying each value
		// of given array by k 
		// void abc(int[] arr, k)
		// int[] abc(int[] arr, k)
		

//		ArrayGenerater obj = new ArrayGenerater() {
//			
//			@Override
//			public void myMethod(int[] arr, int k) {
//				for(int i=0; i<arr.length; i++) {
//					arr[i] = arr[i]*k; 
//				}
//				
//				for(int i=0; i<arr.length; i++) {
//					System.out.print(arr[i] + " ");
//				}
//				
//			}
//		};
		int arr[] = {2,4,6,8,10}; 
		int k = 2; 
		
		ArrayGenerater ob = (myarr, n) -> {
			for(int i=0; i<myarr.length; i++) {
				arr[i] = arr[i]*n; 
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		};
		
		System.out.println("My original array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nArray after multiply by "+k);
		ob.myMethod(arr, k);
		
		
		
		LengthInter ob2 = (ar) -> ar.length;
		System.out.println("\nLength of my Array : "+ob2.getLength(arr));
		
		
		
		
		
	}

}
