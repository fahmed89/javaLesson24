package day4;

public class ActionItem2 {
	
	public static void main(String[] args) {
	
	//Action 2 question- 4	
		
	System.out.println("Factorial is: " + doFactorial(9));	// this is for question-4
		
	
	System.out.println("Fahrenheit value is: " + convertToFahrenheit(42)); // this is for question-6
	
	}
	
	public static long doFactorial(int number) {
		//declare a new int type variable
		long factorial = 1;
		while(number > 1) {
			factorial *= number; //we are multiplying subsequent values with factorial
			number --; //decrementing the given number is every iteration
		}
		
		return factorial;//returning the calculation
	}
	
	//Action 2 question- 6
	
	public static double convertToFahrenheit(int celcius) {
		double fahrenheit;
		fahrenheit = ((celcius * 9)/5) + 32; //conversion formula
		return fahrenheit;
	}
	
	
	
	
	

}
