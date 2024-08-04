package day4;

public class HowManyEvenAndOddNumber {

	public static void main(String[] ages) {
		
		int a[] = {1, 3, 5, 2, 8, 7, 9, 12, 15};
		    
		int even = 0;
		int odd =0;		
		
		for(int var :a) {
			if(var%2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			
		}
		
		System.out.println("Number of even numbers: " + even);
		System.out.println("Number of odd numbers: " + odd);
		
	}
	
	
	
	
	
}
