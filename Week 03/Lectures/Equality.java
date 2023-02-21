public class Equality {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b); //Returns false even though they both look the same
		
		int x = 5;
		int y = 5;
		
		System.out.println(x == y); //This returns true
		
		/*
		 * The discrepancy in results in spite of both being the same, results due to differences in primitive data types and Object types.
		 * Each new instance of an object creates a new instance in memory, thus making them fundamentally different (even though they appear to be the same).
		 */
		
		String c = new String ("Hello");
		String d = c; //refers to same object in memory
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
		//.equals method is used to compare same data in different objects.
		System.out.println("equals() method is " + a.equals(b));

	}

}
