package day6;

public class CheckPalindrome {
	//Q5. Check to see if a string is palindrome or not.
	public static void main(String[] agrs) {
		
		String input = "Oracle";
		
		System.out.println("Given string is a palinrome = " + isPalindrome(input));
		
		
	}

	public static boolean isPalindrome(String str) {
		
		String reversed = "";
		for(int i = str.length() -1; i >=0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
	}
	
	
}
