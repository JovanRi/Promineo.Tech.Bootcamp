package Lectures;

public class Loops {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //start with 'for'; Inside parenthesis there are three pieces to initialize
    for (int i = 0; i < 10; i++) {
      System.out.println("Scoop cup of flour");
    }
      //code starts at 0, then iterate a certain number of times (to iterate refers to execute loop)
      //with a condition, iterate as long as condition is true (boolean expression)
      //Anything inside the {} is part of the 'for' loop (code executed for each iteration)
   System.out.println(" ");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println(" ");
    for (int i = 1; i <=10; i++) {
      System.out.println(i);
    }
    System.out.println(" ");
    for (int i = 0; i <= 100; i+=10) {
      System.out.println(i);
    }
    //same as above but written differently
    System.out.println(" ");
    for (int i = 0; i <= 100; i+=10)
      if (i % 2 == 0) {
        System.out.println(i);
    }
    
    int x = 0;
    while (x < 10) {   //ensure to add a closing loop or else 'while' loop will infinite loop
      System.out.println(x);
      x++;
    }
    
    System.out.println(" ");
    int y = 10;
    while (y < 10) {
      System.out.println(y);
      y++;
    }
    // a 'while' loop checks the condition at the beginning of the loop
    //a 'do' loop checks the condition at the end of the loop
      //thus, a 'do' loop always executes at least once.
    do {
      System.out.println(y);
      y++;
    } while (y < 2);
    
  }
    
}
