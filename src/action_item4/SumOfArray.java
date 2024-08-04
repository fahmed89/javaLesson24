package action_item4;

public class SumOfArray {
	
	
	public static void main(String[] agrs) {
		
		  // array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate sum
        int sum = 1;
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }

}
