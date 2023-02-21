public class MoreArrays {

	public static void main(String[] args) {
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Apples";
		products[2] = "Pomelos";
		products[3] = "Cherries";
		products[4] = "Strawberries";
		
		for(String product : products) {
			System.out.println("Product: " + product);
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		int[] multiplesOf3 = new int[10];
		for(int i = 1; i <= multiplesOf3.length; i++) {
			//i - 1 is done since i starts at 1 but -1 puts it at 0 which is where the array begins
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
			
		}
        
System.out.println(" "); 
System.out.println(" "); 
System.out.println(" "); 
        
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5; //it can do either i * 5, or with parenthesis method. Remember that math resolves parentheses first.
			System.out.println(multiplesOf5[i]);
		}
              		                         
	}

}
