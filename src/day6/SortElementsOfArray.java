package day6;

import java.util.Arrays;

public class SortElementsOfArray {
	
	public static void main(String[] ages) {
		
		//Q3: Sort elements of an array.
		
		//using predefined class
		int array[] = {89, 76, 2, 34, 5, 7, 56};
		//sort all the elements of a given array
		Arrays.sort(array);
		System.out.println("Elements of array in ascending order:");
		for(int value : array) {
		System.out.print(value + " ");	
		}
	    System.out.println(); 
		sortMyarray(array);
	}
	
	//using bubble sort technique
	public static void sortMyarray(int[] givenArray) {
		int length = givenArray.length;
		for(int i = 0; i < length; i++) {
			for(int j=0; j< length -i-1; j++) {
				if(givenArray[j] > givenArray[j+1]) {
					int temp = givenArray[j];
					givenArray[j] = givenArray[j+1];
					givenArray[j+1] = temp;
					
				}
				
			}
			
		}
		System.out.println("Sorted array: ");
		for(int value :givenArray) {
			System.out.print(value +"\t");
		}
	}
	

}
