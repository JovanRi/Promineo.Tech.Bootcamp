package InheritanceAbstractionPolymorphism;

public abstract class Employee {
	//CLASSES CAN ONLY INHERIT FROM ONE ABSTRACT CLASS
	
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
	}
	
	public abstract double calculatedPay();
	//This is an example of polymorphism (each class that can implement it, will do so in their own way)
	//Abstract methods are the only time where a class body does not contain {}
	//this method has to be implemented by classes that inherit from employee
		//thus it will be a little different for each of them.
	
	public String getInformation() {
		//this will return information describing each of the employees
		return "Name: " + firstName + " " + lastName + "\nReports to " + reportsTo + "\nAddress: " + address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

}
