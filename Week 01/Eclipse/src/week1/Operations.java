package week1;

public class Operations {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //operator that acts on different operands
    //mathematical operators (+ - *)/
    int age = 34;
    System.out.println(age);
    boolean isAge34 = age == 34; //Use == to represent equality'
    System.out.println(isAge34);
    
    age = age + 5; //It is called addition when adding numerical data (performing mathematical addition)
    System.out.println(age);
    
    String firstName = "Thomas";
    String lastName = "Rim";
    String fullName = firstName + " " + lastName; //It is called concatenation when combining strings together (performing concatenation of sticking them together)
    
    System.out.println(fullName);
}

}
