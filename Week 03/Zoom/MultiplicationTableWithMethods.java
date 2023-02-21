
import java.util.Scanner;

public class MultiplicationTableWithMethods {

	@SuppressWarnings("resource")
	public static int getMultiplicationTableSize() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the table:");
		int size = input.nextInt();
		
		return size;
	}
	
	public static void printMultiplicationTable(int size) {
		for(int y = 1; y <= size; y++) {
			for(int x = 1; x<= size; x++) {
				System.out.printf("%4d", x * y);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
    int size = getMultiplicationTableSize();
    printMultiplicationTable(size);
    
    System.out.println("What other size?");
    int otherSize = getMultiplicationTableSize();
    printMultiplicationTable(otherSize);
	}

}
