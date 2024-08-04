package day3;

public class SwitchStatementDemo {
	
	public static void main(String[] args) {
		
		/* Condition statement
		 * 
		 * if
		 * if else
		 * switch statement
		 **/
		
		/** Syntax of switch statement
		  switch(variable) {
		case 1: {
			//code
			break;
		}
		case 2: {
			//code
			break;
		}
		default:
		{//
		}
		*/
		
		int num = 1;
		switch(num) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		
		}
		
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		default: {
			System.out.println("This number is not any day of the week");
		}
		
		}
		System.out.println("Out of switch statement.");
		
		
		determineBrowser("firefox");
		
		
		
		
		
	}
	
	
	
	
	/* Write a switch statement to determine which browser to be launched?
	 * The browser options are: Chrome, Firefox, Edge
	 */
	
	public static void determineBrowser(String browserName) {
		switch(browserName) {
		case "chrome":{
			System.out.println("Launch chrome browser.");
			break;
		}
		case "firefox":{
			System.out.println("Launch firefox browser.");
			break;
	   }
		case "edge":{
			System.out.println("Launch edge browser.");
			break;
		}
		default: {
			System.out.println("This browser is not supported");
		}
	
		} 
     }	
	
	
	
	
	
	
}


