package action_item4;

public class LargestAndSmallest {
	
	public static void main(String[] agrs) {
		
		int[] numbers = {4, 8, 2, 5, 9, 1, 3, 7};
		
		if (numbers.length ==0) {
			System.out.println("Array is empty.");
			return;
		}
		
		int min = numbers[0];
		int max = numbers[0];
		
		// find the min and max number
		
		for (int number : numbers) {
			if (number < min) {
				min = number;
				
			}
			if (number > max) {
				max = number;
			}
		}
		
		System.out.println("The Smallest number: " + min);
		System.out.println("The Largest number: " + max);
	}

}
