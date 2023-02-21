package InheritanceAbstractionPolymorphism;

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Tom", "Sawyer", 2500.00);
		Employee hourly = new HourlyEmployee("John", "Smith", 15.00, 75.3);
		Employee manager = new Manager("Rob", "Lincoln", 4500.00, 15.5);
		
		System.out.println(salary.calculatedPay());
		System.out.println(hourly.calculatedPay());
		System.out.println(manager.calculatedPay());

	}

}
