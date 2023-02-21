package Lectures;

public class Zoom {

  @SuppressWarnings("unused")
public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    
    
    double AZ_SALES_TAX = 0.055; //always give variables a relevant name ("tax")
    //final is added for it to not be able to be changed furthermore.
      //e.g. final double test = 93.43;
    //capitalizing all letters of a variable indicates variable should not be modified.
    double priceOfItem = 9.99;
    double tax = priceOfItem * AZ_SALES_TAX;
    System.out.println("Price: " + (priceOfItem + tax));
    
    
    
    int number = 2147483647;
    System.out.println(number);
    System.out.println(number + 1);
    
    //short number ranges are able to fit inside bigger number ranges (bit -> short -> int)
    double x;
    int y = 10;
    x = y;
    
    
    
    boolean isColdOutside = false;
    boolean isRaining = true;
    
    if (isColdOutside && isRaining) {
      System.out.println("Don't go outside!");
    }
      else if (isColdOutside){
        System.out.println("Wear Jacket");
      }
      else if (isRaining) {
        System.out.println("Wear Raincoat");
      }
      else {
        System.out.println("Go On");
      }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

}
