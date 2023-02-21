package Classes;

public class Classes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//	   This is a Class    variable       This is a new Instance
		StringBuilder       name    =     new StringBuilder();
		StringBuilder       name2   =     new StringBuilder();
		
//		Creating new instances of the Student class
		
//This is one way to create an instance of a student inside the class but requires a lot of code to add just one instance.
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel	= 12;
		student1.phoneNumber = "480-123-4567";
		
		student1.introduce();
		
System.out.println("");
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
System.out.println("");
		
		Student student3 = new Student("Tom", "Riddle", "904 320 9876", 11);
		student3.introduce();
		
		
		
		
		
		

		

	}

}
