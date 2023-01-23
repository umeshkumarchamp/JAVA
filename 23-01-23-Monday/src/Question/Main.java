package Question;

public class Main {

	public static void main(String[] args) {
		// ABSTRACT CLASS 
	
		
		RBI b1 = new SBI();
		b1.accHolderName("Umesh");
		b1.money(40000);
		b1.interest(4);
		
		System.out.println();
		
		RBI b2 = new Icici(); 
		b2.accHolderName("Champ");
		b2.money(50000);
		b2.interest(5);
		
		
		
	}

}
