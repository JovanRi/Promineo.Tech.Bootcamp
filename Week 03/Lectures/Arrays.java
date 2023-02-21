

public class Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String studentName1 = "Jonny Jordan";
		String studentName2 = "Giovanni Johnson";
		String studentName3 = "Yoleen Giorna";
		
	//array
		String[] students = new String[3];
	   //type is String //identifier is students operator is =
			//Type indicates that all values in the array will be Strings
		//add [] after any data type to signify array
		//new is used when creating an array
		//use same data type after new as the declared type
			//inside the bracket, declare how many items will exist inside the array
		//AN ARRAY IS NOT DYNAMIC; once created, it cannot grow or shrink contained number of items

	//access elements in array
		//n-1
		students[0] = "Jonny Jordan";
		students[1] = "Giovanni Johnson";
		students[2] = "Yoleen Giorna";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		System.out.println("FOR LOOP");
		//another more efficient way to print out an array is as follows
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
				//since we declared i is 0, students registers i as part of 0 in its array
		}
		
		System.out.println("ENHANCED FOR LOOP");
		
			//Enhanced for loop for a more efficient for loop.
			for (String student : students) {
				//in English, this is read as "For each STUDENT(student) IN(:) my STUDENTS(students) array, what do I want DO ( {} )
				System.out.println(student);
				//STUDENT in this case can be named anything logical. In this case, since the array is plural, we can use its singular form.
			}
	}

}
