public class StringBuilders {
	
	/*
	 * A STRING is used when the value is constant and will have little to no changes.
	 * A STRINGBUILDER is a STRING that is able to dynamically change; used when Strings will go through modifications.
	 */

	public static void main(String[] args) {
		
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
		System.out.println(fullName.deleteCharAt(5)); //uses String Builder to locate the String in memory
		System.out.println(fullName.toString());      //consequently, calling for the String will reflect any changes done as well. 
		                                 //inclusive(deletes)    exclusive (keeps)
		System.out.println(fullName.delete(       1         ,            3        )); //(int START POSITION, int END POSITION)
		System.out.println(fullName.indexOf("it")); //tells where the indicated string begins at
		System.out.println(fullName.replace(0, 1, "John")); //(int START POSITION, int END POSITION, str NEW VALUE TO REPLACE OLD)
		System.out.println(fullName.reverse()); //does not take any parameter

	}
	/*each iteration actually creates a new String memory ("hi"; "hihi", "hihihi"). All iterations now exists inside the memory, but only shows what was called for.
	 * Called a memory leak.
	 */
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	//For String repetition shown above, below shows appropriate program method as to how it should be written.
	public static String multiplyStringBuilder(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
