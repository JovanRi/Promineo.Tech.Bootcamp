public class MoreMethods {

	public static void main(String[] args) {
		
		int[] numList = new int[3];
		numList[0] = 10;
		numList[1] = 20;
		numList[2] = 40;
		
		//This works only if the value will be used one.
		System.out.println(summation(numList));
		/*Below is another way to do if it will be called more than once.
		 * int sum = summation(numList);
		 * System.out.println(sum);
		 */
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 90.5;
		grades[2] = 78.8;
		grades[3] = 60.0;
		grades[4] = 99.1;
		
		System.out.println(calculateAverage(grades));
		System.out.println(Strings("Hello ", 3));
											}
	
	/*
	 * Takes an array of ints and returns the sum of all the ints
	 */
	public static int summation (int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/*
	 * Takes an array of double and returns the average of all elements in the array
	 */
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	/*
	 * Takes a String and an int and returns the String concatenated with itself
	 * int number of times
	 */
	public static String Strings(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
		  //result = result + str
			result += str;
		}
		return result;
	}

}
