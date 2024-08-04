package day5;

public class CountEvenAndOddDigitsInNumber {
	
	public static void main(String[] ages) {
		
	//Count Number of Even and Odd digits in a Number (use any technique).
	
		int num = 251, oddCount = 0, evenCount = 0;
		
		while (num > 0) {
		   int digit = num % 10;
		   if (digit % 2 == 0) {
			   evenCount ++;
		   }else {
			   oddCount ++;
		   }
		   num /= 10;
	//	   num = num / 10;
		}
		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
		
		
	}

}
