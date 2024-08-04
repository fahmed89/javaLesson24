package action_item4;

public class ReverseString {
	
	public static void main(String[] agrs) {
		
		String input = "Farhana";
		String reversed = reverseString(input);
		
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed);
		
	}
	
	public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
	
	

}
