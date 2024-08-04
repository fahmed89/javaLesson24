package action_item4;

public class EvenAndOddNumber {
	
	public static void main(String[] agrs) {
		
		int [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//print even numbers
		System.out.println("Print even numbers....");
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number + " ");
			}
		}
		
		//print odd numbers
		System.out.println("Print odd numbers....");
		for (int number : numbers) {
			if (number % 2 !=0) {
				System.out.println(number + " ");
			}
		}
		
	}

}
