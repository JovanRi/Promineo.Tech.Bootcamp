import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Zoom {

	public static void concatenationSample(int limit) {
		String output = new String();
		for(int index = 0; index < limit; index++) {
			output += index + ",";
			if (index % 100 == 0) {
				output += "\r\n";
			}
		}
		System.out.println(output);
	}
	
	public static void builderSample(int limit) {
		StringBuilder output = new StringBuilder();
		for(int index = 0; index < limit; index++) {
			output.append(index);
			output.append(",");
			if(index % 100 == 0) {
				output.append("\r\n");
			}
		}
		System.out.println(output.toString());
	}
	
	public static void computation(String[] args) {
final int LIMIT = 100000;
		
		Instant start = Instant.now(); 
		//concatenationSample(LIMIT);
		builderSample(LIMIT);
		Instant finish = Instant.now();
		
		System.out.printf("Elapsed: %1.3f seconds%n",
                Duration.between(start, finish).toMillis() / 1000f);

		System.out.println("Complete");
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	/*
	 * Parses the mnemonic phone number information into the actual number.
	 * @param phoneNumber The number to convert
	 * @return The converted phone number.
	 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the mnemonic phone number " + "(i.e. 1800BUYHOME)");
		
		String userInput = input.nextLine();
		String phoneNumber = getPhoneNumber(userInput);
		
		System.out.println("Phone Number: " + userInput + " => " + phoneNumber);
		
		

	}
	
	public static String getPhoneNumber(String phoneNumber) {
	/*
	 * 1800BUYHOME
	 * For each character
	 * Check, is it between A-Z
	 * If it is, lookup the corresponding value for the character and replace the value.
	 */
		StringBuilder output = new StringBuilder(phoneNumber.length());
		for(int i = 0; i < phoneNumber.length(); i++) {
			char value = phoneNumber.charAt(i);
			switch(value) {
			case 'A':
			case 'B':
			case 'C':
				output.append("2");
				break;
			case 'D':
			case 'E':
			case 'F':
				output.append("3");
				break;
			case 'G':
			case 'H':
			case 'I':
				output.append("4");
				break;
			case 'J':
			case 'K':
			case 'L':
				output.append("5");
				break;
			case 'M':
			case 'N':
			case 'O':
				output.append("6");
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				output.append("7");
				break;
			case 'T':
			case 'U':
			case 'V':
				output.append("8");
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				output.append("9");
				break;
			default:
			output.append(value);
			}
			
		}
		return output.toString();
	}

}
