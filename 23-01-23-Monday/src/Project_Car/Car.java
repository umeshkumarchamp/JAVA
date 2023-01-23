package Project_Car;

abstract class Car {
	
	abstract void carName(); 
	abstract void topSpeed(); 	
}

class Alto extends Car{
	@Override
	void carName() {
		System.out.print("Alto ");
	}
	@Override
	void topSpeed() {
		System.out.println(" : 160 KMS");
	}
	
}

class BMW extends Car{
	@Override
	void carName() {
		System.out.print("BMW ");
	}
	@Override
	void topSpeed() {
		System.out.println(" : 200 KMS");
	}
}