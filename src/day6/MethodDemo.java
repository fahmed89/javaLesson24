package day6;

/*1. Method name is a user defined name
 * but it should display the intent of performing an action
 * 2. Method may or may not return any value
 * 3. Method may or may not accept parameters
 * 4. Method can be invoked through object
 * 5. A method is created to perform some action
 */



public class MethodDemo {
	
	//1. No params and No return
	
	public void methodOne() {
		System.out.println("Hey, we are learning method!");
	}
	
	//2. No params and return value
	
	public String methodTwo() {
		String a = "Hello";
		String b = " How are you?";
		return a + b;
	}
	
	//3. Accept a params but does not return

	public void methodThree(String name) {
		System.out.println(name + ", how are you? ");
	}
	
	//4. Take params and return value
	
	public int add(int a, int b) {
		return (a + b);
	}
	
	
}
