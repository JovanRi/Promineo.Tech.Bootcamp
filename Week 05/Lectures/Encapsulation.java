import Classes.Rectangle;
import Classes.Student;

public class Encapsulation {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("12346578467");
		student.introduce();
		
		
		Rectangle rec = new Rectangle(10.11, 15.2);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		
		/*IT IS BEST TO INSTEAD USE ACCESS MODIFIERS
		 * 
		 * Access Modifiers:
		 * public
		 * 		accessible everywhere
		 * private
		 *		ONLY accessible within the class itself
		 * protected
		 * 	 	accessible within the class itself, other class in the same package, and all subclasses
		 * (No Modifier)
		 * 		Same as protected, but NOT ACCESSIBLE IN A SUBCLASS IN DIFFERENT PACKAGE
		 */

	}

}
