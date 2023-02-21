import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		//Lists DO NOT TAKE PRIMITIVE DATA, only Objects
		//e.g. limitations on array
		String[] cars = new String[3];
		cars[0] = "Toyota";
		cars[1] = "Honda";
		cars[2]	 = "Lexus";
		//List<String> where String is the generic that will be replace with the specified type (in this case, String)
		//reads as "List of Strings
		            List  <String> sports = new ArrayList<String>();
		            sports.add("Wrestling");
		            sports.add("Football");
		            sports.add("Basketball");
		            //sports.remove(1); removes string at specified index
		                                     //.size is used for lists (compared to .length in arrays)
		            for (int i = 0; i < sports.size(); i++) {
		            System.out.println(sports.get(i));
		            }
		            
		            
		            for (String sport : sports) {
		            	System.out.println(sport);
		            }
		            
		 //For lists to use primitive data, use its corresponding Object class; called Autoboxing/Autounboxing
		            //
		            List<Integer> numbers = new ArrayList<Integer>();
		            numbers.add(10);
		            numbers.add(20);
		            numbers.add(96);
		            
		            for (Integer number : numbers) {
		            	System.out.println(number);
		            }

	}

}
