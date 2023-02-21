public class Zoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("FizzBuzz Practice");
System.out.println(" ");
//Iterate integers from 1 to 50
//For multiples of 3, print "Fizz"
//For multiples of 5, print "Buzz"
//For number which are multiples of both 3 and 5, print "FizzBuzz".

for (int number = 1; number <=50; number++) {
	if ((number % 3 == 0) && (number % 5 == 0)){
		//if (number % 15 == 0) Where 15 = xy = multiple of both "x" and "y" problems
		System.out.println("FizzBuzz");
						 }
	else if (number % 3 == 0) {
		System.out.println("Fizz");
	}
	else if (number % 5 == 0) {
		System.out.println("Buzz");
	}
	else System.out.println(number);		
											}


System.out.println(" ");System.out.println(" ");System.out.println(" ");


Object [] stuff = new Object [] {
	"George", 5, 3.14
								};
//These two perform same function; simply written differently
Object [] stuffOther = new Object [5];
stuffOther [0] = "Ava";
stuffOther [1] = 85.4;
stuffOther [2] = 8;
stuffOther [4] = "Timmy";

for (int index = 0; index < stuff.length; index++) {
	System.out.println(stuff[index]);
													}

System.out.println(" ");

int otherIndex = 0;
while (otherIndex < stuffOther.length){ //always address it dynamically (xxxxx.length) in case the array length is changed above
	System.out.println(stuffOther [otherIndex]);
	otherIndex++; //to close the while loop
	//null is given to unassigned array values
										}
System.out.println(" ");
//This is an enhanced for loop; iterates through each of the values
//Don't use if you need to keep track of your position
for(Object myStuff : stuff) { //for each myStuff in stuff array
	System.out.println(myStuff);
}

System.out.println(" ");

	}

}
