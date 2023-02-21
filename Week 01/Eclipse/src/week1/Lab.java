package week1;

public class Lab {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //create a variable to hold the quantity of available plane seats left on a flight
    int availablePlaneSeats = 10;
    
    
    //create a variable to hold the cost of groceries at checkout
    double costOfGroceries = 13.81;
    
    //create a variable to hold a person's middle initial
    char middleInitial = 'R';
    
    //create a variable to hold true if it's hot outside and false if it's cold outside
    boolean isHotOutside = true;
    
    //create a variable to hold a customer's first name
    String customerFirstName = "John";
    
    //create a variable to hold a street address
    String streetAddress = "1235 N Temple Dr.";
    
    //print all variables to the console
    System.out.println("Available plane seats left on a flight: " + availablePlaneSeats);
    System.out.println("Cost of groceries at checkout: " + costOfGroceries);
    System.out.println("This person's middle initial is: " + middleInitial);
    System.out.println("It is hot outside: " + isHotOutside);
    System.out.println("The customer's first name is: " + customerFirstName);
    System.out.println("The street address is: " + streetAddress);
    
    //a customer booked 2 plane seats, remove 2 seats from the available seats variable
    availablePlaneSeats = availablePlaneSeats -2;
    //availablePlaneSeats -= 2; is another option
    System.out.println(availablePlaneSeats);
    
    //impulse candy bar purchase, add 2.15 to the grocery total
    costOfGroceries += 2.15;
    System.out.println(costOfGroceries);
    
    //birth certificate was printed incorrectly, change the middle initial to something else
    middleInitial = 'K';
    System.out.println(middleInitial);
    
    //the season has changed, update the hot outside variable to be opposite of what it was
    isHotOutside = false;
    System.out.println(isHotOutside);
    
    //create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
    String fullname = customerFirstName + " " + middleInitial + " Willow";
    System.out.println(fullname);
    
    //print a line to the console that introduces the customer and says they live at the address variable
    System.out.println("This is " + fullname + " and lives at " + streetAddress);

}

}
