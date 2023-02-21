package Classes;

public class Student {
	
	//These will belong in the CLASS level, not inside a method.
	 
	//The properties are assigned to each student, however, each value of the property is unique. NOT SHARED.
	
	//However, a static can be added when wanting to have a property shared among the class
	static int numberOfStudents;

	
//CONSTUCTORS//
	
	/*Doing this means that each Instance created in this class will have its own firstName, lastName, etc.
	  Thus, terminate(;) it without a value (= x).
	  These four piece of data are properties given to represent the class, in this case, Student.
	  Addin private prevents access from other classes
	*/
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public int gradeLevel;
	
	public Student(){}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	/*Classes have a special method called a Constructor - the method you call when you create an instance such as the one above.
	Constructors are THE ONLY METHOD to not put a return type on.
	Only put the name of the class.
	You can add parameters inside the parenthesis
	*/
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
		
	}
	
	
//PUBLIC METHODS//
	
	//Not taking any parameters (nothing past the introduce) since it will use the properties from the Student class.
	public void introduce() {
	System.out.println("Hello, my name is " + firstName + " " + lastName);
	System.out.println("I am in grade " + gradeLevel);
	System.out.println("my phone number is " + phoneNumber);
	}
	

//PRIVATE METHODS
	
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	
	
//GETTERS AND SETTERS//
	
	/* Way to access properties in Java
	 * Also known as accessors and mutators
	 * These are methods for accessing data or mutating data
	 */
	//It is void since it won't return anything but it's going to take a property and assign the value, in this case to the first name filled in this class
	//Thus the data type has to be string because IT HAS TO MATCH THE VALUE WE'RE SENDING THE VALUE TO
	public void setFirstName(String firstName) {
		if(checkLength(firstName, 1)) {
		this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if(checkLength(lastName, 1)) {
		this.lastName = lastName;
		}
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) {
		this.phoneNumber = phoneNumber;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
		this.gradeLevel = gradeLevel;
		}
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	

}
