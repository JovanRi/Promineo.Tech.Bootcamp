package Lectures;

public class openClassLoops {


	public static void main(String[] args) {
		//Using a for loop, raise base to the power of power
		int base = 12;
		int power = 3;
		int result = 1;
		
		for(int i = 1; i <= power; i++) {
			result *= base;
		}
		System.out.println("Result: " + result);
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

		//Add A Number A Certain Number of Times
		int howManyTimes = 4;
		int numToAdd = 7;
		int sumResult = 0;
		do {
			sumResult += numToAdd;
			howManyTimes--;		
		} while (howManyTimes > 0);
		System.out.println(sumResult);
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

		//Multiplication Table: Create a for loop that prints out a multiplication table for num through 10 as follows:
		int num = 222;
		
		System.out.println("Multiplication Table of " + num);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num +" x " + i + " = " + (num*i) );
		}
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

		//Print String once with a do loop
		int x = 0;
		do {
			System.out.println("I will print!");
			x++;
		} while (x > 1);
		
		/*Create an if/else statement that checks to see if userNumber is more than 10 and under 100.
		 * If so, then execute a while loop that prints the value of userNumber and decrements by 1 until it is less than 10.
		 * If not, print (exactly) "Your number is not between 10 and 100." to the console.
		 */
		int userNumber = 20;
		if ( userNumber > 10 && userNumber < 100 ) {
			while ( userNumber >= 10 ) {
            	System.out.println(userNumber);
                userNumber--;
                }
			}else {
				System.out.println("Your number is not between 10 and 100.");
					}
		
		/*Write a for loop that starts at zero and loops the length of a user-entered String saved in userWord. 
		 * Every time the loop runs, the userWord is added to the variable longString to make a repeating string.
		 */
			String userWord = "String";
			String longString = "";
			
			for(int i = 0; i < userWord.length(); i++) {
				longString += userWord;
			}
			System.out.println(longString);
			
			/*Write a loop that does a countdown from the variable countDown. This number represents the number that a user enters. 
			 * Check to make sure the number is not larger than 10, but greater than or equal to 3. 
			 * Each time the loop runs, print to the console the value of the counter followed by three periods (…). 
			 * Your console should print (10…, 9…, 8…, etc.) Once out of the loop, print to the console "We have lift off!". 
			 * If a number is less than 3 or greater than 10, then the only message printed to the console is "We have lift off!"
			 */
			int countDown = 10;
			if(countDown >= 3 || countDown <= 10){
				while (countDown >= 1) {
	                System.out.println(countDown + "...");
	                countDown--;
	            }
			 }
			System.out.println("We have lift off!");
			
			/*Create a for loop that prints the numbers 0 to x to the console, where x is a value that is provided by the user. 
			 * Make sure that you check for the value of x to be greater than zero (0).
			 * Use the System.out.println that is in the code to print to the console when x is less than one (1)
			 */
			int y = 0;
			int z = -27;
			if(z >= 1) {
				while (y <= z) {
					System.out.println(y);
					y++;
				}
			} else {
				System.out.println("Please enter a number greater than 0.");
			}
			 
			
			/*Check to see if userNumber is between 1 and 100. 
			 * If it is, create a while loop that prints all integer values starting with userNumber to 100. 
			 * If not, print (exactly) "Your number was not between 1 and 100." to the console.
			 */
			int userNumbers = 25;
			if (1 < userNumbers && userNumbers < 100) {
				while(userNumbers <= 100) {
					System.out.println(userNumbers);
					userNumbers++;
				}
			} else {
				System.out.println("Your number was not between 1 and 100.");
			}
			
			/*Create a for loop that starts at 1 and goes to 100, 
			 * but increments by the value of userValue and prints the value of the counter to the console each time the loop processes. 
			 * Also, check to make sure that userValue is greater than 0. If userValue is not greater than 0, print 
			 * "Your number needs to be greater than 0."
			 */
			
			int userValue = 6;
			if(userValue > 0) {
				for(int i = 1; i <= 100; i += userValue) {
					System.out.println(i);
				}
			} else {
				System.out.println("Your number needs to be greater than 0.");
			}
			
			/*Create a do while loop that checks the length of userWord and if that word is less than 5 characters, 
			 * then print userWord to the console 1 time. 
			 * If it is 5 or more characters print userWord to the console userWord.length() number of times.
			 */
			
			String userW = "Target";
			int wordLength = userW.length();
			int counter = wordLength;
			do {
				System.out.println(userW);
				if(wordLength < 5) {
					break;
				}
				counter --;
			} while (counter > 0);
			
			
			/*The user is providing you with two (2) values. The first is stored in the variable numToAdd. 
			 * The second value is stored in the variable howManyTimes. 
			 * Create a do while loop that adds numToAdd to a variable sumResult as many times as the loop runs, which is set by howManyTimes.
			 */
			int numToAdds = 15;
		    int howManyTimess = 0;
		    int sumResults = 0;
		    	do {
		        sumResults += numToAdds;
		        howManyTimess--;
		    } while (howManyTimess > 0);
		    System.out.println(sumResults);
			
	}
	
	


			
			
	
	
	
	
			




}
    



