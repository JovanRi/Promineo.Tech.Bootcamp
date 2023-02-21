import java.util.Scanner;

public class ObjectsAndJavadocs {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		String name = "Sally Mae";
		String fullName = new String("Thomas Jones"); //NEVER TYPE STRING LIKE THIS
		System.out.println(name.length()); //length in this case is a property, needing a ()
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('M'));
		
		
		Scanner s  = new Scanner(System.in);
		//new keyword is added to create any new instance of an object EXCEPT FOR A STRING
		int[] numbers = new int[3];
		System.out.println(numbers.length); //in an array, length is a method, thus not needing a ()
		
		 //Objects allow to call for modifiers (.charAt, .indexOf)

	}

}
