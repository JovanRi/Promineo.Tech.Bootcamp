package InheritanceAbstractionPolymorphism;

public class Manager extends Employee{

	private double bonusPercent;
	
	
	public Manager(String firstName, String lastName, double pay, double bonusPercent) {
		super(firstName, lastName, pay);
		this.bonusPercent = bonusPercent;
	}
	
	@Override
	public double calculatedPay() {
		return getPay() * 80 * bonusPercent;
	}
	


}
