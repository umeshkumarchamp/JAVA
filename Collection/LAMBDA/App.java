package LAMBDA;
@FunctionalInterface
interface Inter
{
	void hello(String name); 
}

@FunctionalInterface
interface Inter1{
	int getLength(String str);
}

@FunctionalInterface
interface Inter2{
	int largestBetweenThreeNumber(int a,int b, int c); 
}

//class Abc implements Inter{
//
//	@Override
//	public void hello() {
//		System.out.println("Hello Guyz!");
//	}
//	
//}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    Normal Interface
		    Marker Interface
		    Functional Interface 
		       (Runnable, ActionListener, method, ItenListener, Comparable)
		    
		 */
//		Inter obj = new Abc(); 
//		obj.hello();
		
		// 2nd approach..
//		Inter ob = new Inter() {
//
//			@Override
//			public void hello() {
//				System.out.println("Hello Umesh..");
//			} 
//		}
//		ob.hello();
		
		Inter obj = (name)->{
			System.out.println("Hello "+name);
			System.out.println("Good Night.");
		}; 
		obj.hello("Dodo");
		
		Inter1 ob = (name) ->name.length();
		System.out.println("Your name length is : "+ob.getLength("Umesh"));
		
		
		Inter2 ob2 = (a,b,c)->{
			
			if(a>b && a>c)
				return a;
			else if(b>a && b>c)
				return b;
			return c;
		};
		System.out.println("The largest number is "+ob2.largestBetweenThreeNumber(5, 12, 9));
	}

}
