package day5;

public class PalindromeOrNot {
	
	public static void main(String[] aggs) {
		//Action item 3 question 4
		//Find out a number is palindrome or not (use conditional
		//statements + looping). If a given number is 121 after reversing it
	    //remains as 121 then we shall call this number as palindrome.*//
		
		int originalNumber = 353, reverse = 0;
		System.out.println("The reverse number is: " + originalNumber);
		int number = originalNumber;
		
		while(number !=0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number /10;
		}
		System.out.println("The reverse number is: " + reverse);
		
		if (originalNumber == reverse) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
	}

}
