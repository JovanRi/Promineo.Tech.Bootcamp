package InheritanceAbstractionPolymorphism;

public class SalariedEmployee extends Employee{

	public SalariedEmployee(String firstName, String lastName, double pay) {
		//super takes it from the superclass; it is the superclass constructor
		super(firstName, lastName, pay);
		
		
	}

	@Override
	public double calculatedPay() {
		return getPay() * 80;
	}
	


}
