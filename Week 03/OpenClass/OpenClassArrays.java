public class OpenClassArrays {

	public static void main(String[] args) {

		int a,b,c,d,e;
		a = 50;
		b = 25;
		c = 10;
		d = 5;
		e = 0;
		reverseArray(a, b, c, d, e);

	}
	//Create an array of integers called arrayInt. Return the last item in arrayInt
	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
		int[] arrayInt = {num1, num2, num3, num4, num5, num6};
		return arrayInt[arrayInt.length - 1];
	}
	
	/* In this problem you will create a multidimensional array of integers named arr. 
	 * The user will enter in two integer values. Use these integer values to initially declare your new array arr, 
	 * where these integers determine the size of both dimensions of the array. 
	 * Then, use these integer values to create both an inner and outer array using some type of loop to loop from zero (0) through whatever number the user entered.
     * To complete this problem, when you've populated the arrays (after the nested for-loops have completed), 
     * print the last element of the first array to the console. 
	 */
	static void multidimensional(int a, int b) {
		int[][] arr = new int[a][b];
		for ( int i = 0; i < a; i++ ) {
		    for ( int j = 0; j < b; j++ ) {
		    	 arr[i][j] = j;
		    }
		    }
		System.out.println(arr[0][arr[0].length - 1]);
	}
	
	/*Given an array of words, create a new array that combines three (3) words provided by the user and the original array. 
	 * Loop through the new array and print each element to the console.
	 */
	static void newArray(String word1, String word2, String word3, String[] arr) {
		String[] newArr = { word1, word2, word3 };
		String[] combinedArr = new String[arr.length + newArr.length];
		int counter = 0;
		
		for ( String str : arr ) {
		    combinedArr[counter] = str;
		    counter++;
		}
		
		for ( String str2 : newArr ) {
		    combinedArr[counter] = str2;
		    counter++;
		}
		
		for ( int i = 0; i < combinedArr.length; i++ ) {
		    System.out.println(combinedArr[i]);
		}
	}
	
	/*Using a user provided word, create a new array that is made up of the characters of the word stored in the variable userWord. 
	 * Once you have created that array, print to the console each element of the array.
	 */
	static void charArray(String userWord) {
		char[] arr = new char[userWord.length()];
		for ( int i = 0; i < userWord.length(); i++ ) {
			arr[i] = userWord.charAt(i);
		}
		
		for ( int j = 0; j < arr.length; j++ ) {
		    System.out.println(arr[j]);
		}
	}
	
	/* Take the value of userWord and turn it into an array of characters from each letter in word. 
	 * Call your new array charArray and return that variable in the method wordToArray
	 */
	static char[] wordToArray(String userWord) {
		char[] charArray = new char[userWord.length()];
		for(int i = 0; i < userWord.length(); i++) {
			charArray[i] = userWord.charAt(i);
		}
		return charArray;
	}
	
	/*Create an array using five (5) integers provided by the user. 
	 * Once the array is created, create a new array that is the reverse of the original array. 
	 * Loop through each array and print each element in the console.
	 */
	static void reverseArray(int a, int b, int c, int d, int e) {
		//Array in ascending index
		int []	arr = {a, b, c, d, e};
		int j = arr.length;
		
		//Array in descending index
		int[] reverseArr = new int[j];
		for(int i = 0; i < arr.length; i++) {
			reverseArr[j-1] = arr[i];
			j--;
		}
		//Prints array
		for(int x : arr ) {
			System.out.println(x);
		}
		//Prints array in reverse order
		for(int y : reverseArr) {
			System.out.println(y);
		}
	}
	
	/*Given an array of integers, replace the first and last value stored in the array with integer values provided by the user. 
	 * Loop through the array and print the changed array to the console.
	 */
	static void changeTwo(int a, int b, int[] arr) {
        arr[0] = a;
        arr[arr.length - 1] = b;
        for ( int x : arr ) {
            System.out.println(x);
        }
	}
	
	/*Take the integer value stored in the variable num and build an array of that size called numArray. 
	 * To fill the array, you will write a for loop that checks to see if the iterator is less than num and add each iteration to one of the slots in numArray. 
	 * Return the variable numArray.
	 */
	static int[] buildArray(int num) {
	int[] numArray = new int[num];
	
	for ( int i = 0; i < num; i++ ) {
	    numArray[i] = i;
	}
	return numArray;
	}
	
	
	/*Given an array of integers, loop through the array, print the original values, 
	 * and then add the integer value provided by the user to each element stored in the array. 
	 * Loop through the new values and print out each new value to the console.
	 */
	static void addX(int[] arr, int x) {
		System.out.println("**Original**");
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		    arr[i] += x;
		}
		
		System.out.println("**New Array**");
		for ( int j = 0; j < arr.length; j++ ) {
		    System.out.println(arr[j]);
		}
	}
}
