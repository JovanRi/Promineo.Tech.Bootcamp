import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		System.out.println("Hi");
		
		if(numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		System.out.println("Bye!");
		
		/*
		 * Checked Exception - explicitly check for in our code.
		 * 	try catch block - handles checked exceptions
		 * 
		 * Unchecked Exception - Mistakes in the code; We can avoid these by writing clean code and following best practices
		 */
		
		//Use this to try to run a code and use catch to capture a snapshot of the error.
//		try {
//			System.out.println(numbers[3]);
//			System.out.println("in the try");
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
		
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileReader fileReader = new FileReader("something.txt");
			//GO FROM THE MORE SPECIFIC EXCEPTIONS TO MORE GENERAL EXCEPTIONS
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (Exception e){
			
		} finally { //a finally can be added to first test the code, if it runs succesfully, 'finally' runs the code
			System.out.println("finally!");
		}
			System.out.println("after the try catch");
			
			
			
			try {
				openFile("Anotherfile.jpg");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
													//a 'throws' delcaration handles the exception OUTSIDE THE METHOD
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}

}
