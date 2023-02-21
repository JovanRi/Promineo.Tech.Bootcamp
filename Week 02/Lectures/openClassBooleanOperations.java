package Lectures;

public class openClassBooleanOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double assignment1, assignment2, assignment3, assignment4;
assignment1 = 80.50;
assignment2 = 79.30;
assignment3 = 95.90;
assignment4 = 100.00;

if (assignment1 + assignment2 > 150.0 && assignment3 > 70.0 || assignment4 > 70.0) {
System.out.println("You passed the class.");
	 									}
	 else {
		 System.out.println("You failed the class.");
	 		}
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

		int moneyInBank = 1500;
		int rentDue = 1000;
		int carPayment = 400;
		int food = 100;
		
		int billsSum = rentDue + carPayment + food;
		if ( (moneyInBank - billsSum) >= 0) {
			System.out.println("You have enough money this week.");
		}
		else {
			System.out.println("You may need to borrow some money.");
		}
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

		int personOneAge = 19;
		int personTwoAge = 20;
		int personThreeAge = 21;
		
		if(personOneAge > personTwoAge && personOneAge > personThreeAge){
			System.out.println("Person one is older.");}
			else if (personTwoAge > personOneAge && personTwoAge > personThreeAge){
				System.out.println("Person two is older.");}
			else {
				System.out.println("Person three is older.");}
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
		
		String day = "Monday";
		String month = "October";
		if( day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("There is no school today!");
		} else {
			System.out.println("There is school today...");
		}
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
		

		int num1 = 150;
		int num2 = 60;
		int num3 = 75;
		if ((num1 > num2) && (num2 < num3) && (num1 > num3)){
            System.out.println(true); //boolean operator
		} else {
            System.out.println(false); //boolean operator
            	}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
				
		
										}
											}


