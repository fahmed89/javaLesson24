package day2;

public class AssignmentOperatorDemo {
	
	
	public static void main(String[] args) {
		//Assignment (shorthand) = += -= *= /= %=
		
		//Example
/*		int a = 10;
//		a = a + 5;      OR
		a+=5;
		System.out.println(a);//15
		*/
		//Example2
		int a = 10;
//		a = a -5;
		a -= 5;
		System.out.println(a);//5
		
		//Example 3 (mul a by 5)
		a *= 5;
		System.out.println(a);//25
		
		//Example 4 (div a by 4)
		a /=4;
		System.out.println(a);//6
		
		//Example 5 (% a by 4)
		a %=4;
		System.out.println(a);//2
		
	}

}
