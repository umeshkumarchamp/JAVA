package Question;

abstract class RBI {
	abstract void accHolderName(String name); 
	abstract void money(int money);
	abstract void interest(int interest); 
	
}

class SBI extends RBI {
	@Override
	void accHolderName(String name) {
		System.out.println("Account Holder Name : "+name);
	}
	
	int intre; 
	@Override
	void money(int money){
		intre = money; 
		System.out.println("Your Money : "+money);	
	}
	
	@Override
	void interest(int interest) {
		int amt = ((intre*interest)/100)+intre;
		System.out.println("Your Money after adding interest : "+amt);
		
	}
	
}

class Icici extends RBI {
	@Override
	void accHolderName(String name) {
		System.out.println("Account Holder Name : "+name);
	}
	
	int intre;
	@Override
	void money(int money){
		intre = money; 
		System.out.println("Your Money : "+money);	
	}
	@Override
	void interest(int interest) {
		int amt = ((intre*interest)/100)+intre;
		System.out.println("Your Money after adding interest : "+amt);
		
	}
	
}
