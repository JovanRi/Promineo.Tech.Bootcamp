package Lectures;

import java.util.Scanner;
//Enables use of scanner in class here

public class UserInput {

  @SuppressWarnings("resource")
public static void main(String[] args) {
    // TODO Auto-generated method stub
    //How to get user input from console
    //Scanner is a data type
    Scanner sc = new Scanner (System.in);
    //Hover over Scanner to select import java util Scanner to add functionality of scan in class
    
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    //sc.nextLine records what the user typed on previous line. Adding a String then saves what was recorded into the string (in this case, "name")
    
    System.out.println("Welcome, " + name);
    
    System.out.println("Select an option.");
    System.out.println("1) add candybar to shopping cart: 1.19");
    System.out.println("2) add fruit to shopping cart: 2.49");
    System.out.println("3) add milk to shopping cart: 5.99");
    
    int selection = sc.nextInt();
    //sc.nextint grabs the numerical data value from previous int
    double total = 0;
    //double is used since numerical values have decimals in them.
    
    switch (selection) {
      case 1:
        total += 1.99;
        break;
      case 2:
        total += 2.49;
        break;
      case 3:
        total += 5.99;
        break;
      default:
        //Show when not selecting anything
        System.out.println("Please pick a valid option");
        
    }
   System.out.println("Your current total is: " + total);     
  }
}
