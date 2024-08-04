package action_item4;

import java.util.Arrays;

public class SortElementArray {
	
	public static void main(String[] agrs ) {
		
		int [] numbers = {2, 8, 3, 7, 1, 6, 9, 4};
		
		Arrays.sort(numbers);

        // Print the Array Statement
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
            
		
	    }
	}
}
