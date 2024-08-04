package day5;

public class SmallestOfTheeNumber {
	
	public static void main(String[] ages) {
		
		//Find out smallest of 3 numbers (use if..else).
		int a = 89, b = 67, c = 37, smallest;
		//comparing between a and b and extracting the  smallest
		int temp = (a < b)? a : b;
		
		//comparing temp with c and store the result in smallest variable
		smallest = (c < temp)? c : temp;
		
		System.out.println("The smallest number is: " + smallest);
		
		//more concise approach for brain storming
		
		smallest = c < (a < b ? a : b) ? c : (a < b ? a : b);
		
	}
	
	

}
