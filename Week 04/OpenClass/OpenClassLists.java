import java.util.ArrayList;
import java.util.List;

public class OpenClassLists {

	public static void main(String[] args) {
		
		/*Given five (5) numbers by the user stored in num1, num2, num3, num4, and num5, 
		 * create a List called squaredNums that takes the user values 
		 * and stores the squared value of that number as an element of squaredNums.
		 */
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		System.out.println(squaredList(num1,num2,num3,num4,num5));
		
		
		/*Create a List of integers from one to the value stored in endNum. 
		 * After the List has been created, then print it to the console.
		 */
		int endNum = 9;
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 1; i <= endNum; i++) {
			myList.add(i);
		}
		System.out.println(myList);
		
		/*Given a List of characters called alphabet, 
		 * search the list for the character stored in userLetter 
		 * and print to the console the index value of that character.
		 */
		
		char userLetter = 'z';
		
		List<Character> alphabet = new ArrayList<>();
		for(int i = 97; i <(97+26); i++) {
			alphabet.add((char)i);
		}
		findLetter(alphabet, userLetter);
		
		/*Create a list that finds all the (positive) factors of the value of userNumber and stores them as elements of the list. 
		 * At a minimum all values of userNumber will have two (2) possible factors at a minimum; one (1) and userNumber. 
		 * Then print the list to the console. 
		 */
		int userNumber = 50;
		factors(userNumber);
		
		/*
		 * Given four integer numbers stored in the variables num1, num2, num3, and num4, 
		 * create a List that stores all of the values plus the sum of all the values in the last element in the List. 
		 * Print the List to the console.
		 */
		List<Integer> myList2 = new ArrayList<Integer>();
		myList2.add(num1);
		myList2.add(num2);
		myList2.add(num3);
		myList2.add(num4);
		myList2.add(num1 + num2 + num3 + num4);
		
		System.out.println(myList2);
		
		/* Given a List of five (5) words entered in by the user, create a new List called newList 
		 * that contains every other List item from the original list starting with the first item.
		 * Print (to the console) the old List using "The old list is: ", and the new List using "The new list is: " .
		 */
		String word1, word2, word3, word4, word5;
		word1 = "Red";
		word2 = "Yellow";
		word3 = "Green";
		word4 = "Blue";
		word5 = "Purple";
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		halfList(words);
		
		/*Given a List called tenWords that contains ten (10) different words, write a program that takes integer values stored in num1, num2, and num3 
		 * and use that to find the value stored in the particular positions in the List. 
		 * Take these three (3) words and create a new List called threeWords. 
		 * Print out the List stored in threeWords to the console. 
		 * Don't forget to make sure each of the numbers entered for num1, num2, and num3 is between 0 and 9, 
		 * otherwise, print "Sorry, there was an error getting a number you requested."
		 */
		int nums1 = 15;
		int nums2 = 5;
		int nums3 = 2;
		
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, nums1, nums2, nums3);
		
		
		/*Given a list stored in productList, write a program that will access elements in the list based on the index value stored in indexVal. 
		 * Because this number is provided by the user, check to make sure the number is at least zero (0), 
		 * but not larger than the index value of the last item in the list.
		 * If indexVal is valid, print the product associated with the value stored at indexVal. 
		 * If indexVal is not valid, then print "No product can be found with that product number." to the console.
		 */
		
		int indexVal = 6;
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 12");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S20");
		
		if (indexVal >= 0 && indexVal < productList.size()) {
		    System.out.println(productList.get(indexVal));
		} else {
		    System.out.println("No product can be found with that product number.");
		}
		
		
		/*Given the value stored in the variable endNum, do the following:

		-- Create a List of integers that contains the numbers from 1 to endNum.

		-- Print the first element from the List using "The first number in the List is "

		-- Print the last element of the List (without using the hard-coded index- i.e. someList.get(190) is not what we want here), to the console using "The last number in the List is "

		-- Don't forget to check if endNum is greater than zero (0), otherwise print "Your List cannot be created with a number less than zero."
		 */
		int endNum2 = 900;
		
		beginEnd(endNum2);



		
	}
	
	public static List<Integer> squaredList(int num1, int num2, int num3, int num4, int num5) {
		List <Integer> squaredNums = new ArrayList<Integer>();
		squaredNums.add(num1*num1);
		squaredNums.add(num2*num2);
		squaredNums.add(num3*num3);
		squaredNums.add(num4*num4);
		squaredNums.add(num5*num5);
		
		return squaredNums;
	}

	
	public static void findLetter(List<Character> alphabet, char userLetter) {
		int valueIndex = alphabet.indexOf(userLetter);
		System.out.println(valueIndex);
}

	public static void factors(int userNumber) {
		// declare the List of integer
				List<Integer> factorNum = new ArrayList<>();
		// start your loop at 1, and go to the final number
				for (int i = 1; i <= userNumber; i++) {
		// if userName is divisble equally by the index, add the index to the new List.
				if ( userNumber % i == 0) {
				       factorNum.add(i);
				}
				}
				System.out.println(factorNum);
	}
	
	public static void halfList(List<String> words) {
		// Declare a new List of String
				List<String> newList = new ArrayList<>();
		// Put every other entry into the new List, starting with the first (index 0)
				for(int i = 0; i < words.size(); i++) {
					 if ( i % 2 == 0 ) {
					        newList.add(words.get(i).toString());
					 }
				}
				// Print out the old List, and the new List
				System.out.println("The old list is: " + words);
				System.out.println("The new list is: " + newList);
	}

	
	public static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
		// Write your code below this line
		if ((num1 >= 0 && num1 < 10) && (num2 >= 0 && num2 < 10) && (num3 >= 0 && num3 < 10)) {
		    List<String> threeWords = new ArrayList<String>();
		    String word1 = tenWords.get(num1);
		    String word2 = tenWords.get(num2);
		    String word3 = tenWords.get(num3);
		    
		    threeWords.add(word1);
		    threeWords.add(word2);
		    threeWords.add(word3);
		    System.out.println(threeWords);
		}else {
		    System.out.println("Sorry, there was an error getting a number you requested.");
		}
	}
	
	public static void beginEnd(int endNum) {
		// Add your code below this line
		
		// If endNum is greater than zero, create a new List
				if ( endNum > 0 ) {
					List<Integer> newList = new ArrayList<>();
				    for ( int i = 1; i <= endNum; i++ ) {
				    	newList.add(i);
				    }
				 // Print the first entry & the last entry in the List
				    System.out.println("The first number in the List is " + newList.get(0));
				    System.out.println("The last number in the List is " + newList.get(newList.size()-1));
				    
				 // if endNum is not greater than zero, print this message.
				} else {
				    System.out.println("Your List cannot be created with a number less than one.");
				}
	}
}





