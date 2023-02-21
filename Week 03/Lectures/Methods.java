public class Methods {

	public static void main(String[] args) {
	//VOID does something; does not have to return anything back	
		String firstName = "Bob";
		String lastName = "Ross";
		//String fullName = firstName + " " + lastName; is one way to generate the combined String
		//Below is a better way to call through a method.
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
				//PARAMETERS are like a parking spot (e.g. String)
				//ARGUMENTS are like cars (e.g. what you put inside the parameter)

	}
	//This is called method signature    String x becomes firstName from above; String y becomes lastName
	public static String createFullName (String x, String y) {
		//ACCESS MODIFIERS (public static) GIVE THE METHOD A VERB (createFullName) SINCE IT DOES SOMETHING
		//The parenthesis inside the method can be BLANK or can have PARAMETERS (String x) input that the method takes in order to do something with it
		//The method does not have to match the name of the parameter (firstName with firstName) it has to only match the parameter (String with String)
		return x + " " + y;
		//return is used whenever you have a type that is going to return a piece of data of that type
		
	}
}
