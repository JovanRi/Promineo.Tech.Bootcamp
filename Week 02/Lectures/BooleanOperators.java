package Lectures;

public class BooleanOperators {

  @SuppressWarnings("unused")
public static void main(String[] args) {
    // TODO Auto-generated method stub
    // == equality operator
    System.out.println(2 == 3); //considered a boolean expression
    System.out.println(2 > 5);
    System.out.println(3 <= 5);
    System.out.println(5 <= 5);
    System.out.println("Defining and, or boolean");
    //'and' defined by && (both need to be true)
    //'or' defined by || (one or the other need to be true)
    System.out.println(2 == 6 && 1 < 5);
    System.out.println(true && true); //because both are true, result is true
    System.out.println(true && false); //because one of them is not true (e.g. in order to trade you something, I want itemA AND itemB; thus I have to give both itemA and itemB)
    System.out.println(true || false); //because one of them is at least a value of true
    System.out.println(false || false); //because one of them still has to be true in order for it to return true altogether
    System.out.println("mathematical operations");
    System.out.println(2 == 3 || 1 == 5);
    System.out.println(2 == 3 && 1 == 5);
  }

}
