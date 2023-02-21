package Lectures;

import java.util.Scanner;

public class BMI_Calculator {

  @SuppressWarnings("resource")
public static void main(String[] args) {
    // TODO Auto-generated method stub
      final double METRIC_CONVERSION = 703;
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your weight in lbs: ");
    double weight = input.nextDouble();
    input.nextLine();
    
    System.out.println("Enter your height in inches: ");
    double height = input.nextDouble();
    
    System.out.printf("Weight: %3.2f%n", weight);
    System.out.printf("Height: %3.2f%n", height);
    
    //Calculate the BMI
    // weight (lb) / [height (in)]2 x 703
    double bmi = weight / (height*height) * METRIC_CONVERSION;
                          //Math.pow(height, 2)
    System.out.printf("BMI: %3.2f%n", bmi);
  }

}
