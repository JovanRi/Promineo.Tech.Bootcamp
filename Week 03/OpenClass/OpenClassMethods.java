public class OpenClassMethods {

	public static void main(String[] args) {
	

	}
	
	public static int numArray(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	//Write a method call sumOfDigits that takes an integer variable called digits. Then return the sum of all the numbers in digits.
	public static int sumOfDigits(int digits) {
		int sum = 0;
		while (digits != 0) {
		sum = sum + digits % 10;
		digits = digits / 10;
		}
		return sum;
	}

}
