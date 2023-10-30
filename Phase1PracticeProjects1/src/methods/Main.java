package methods;

public class Main {
//	DECLARING METHOD WITHOUT PARAMETERS
	public void sayHello() {
		System.out.println("Hello there...");
	}
	
//	DECLARING METHOD WITH PARAMETERS
	public int sum(int a, int b) {
		return a+b;
	}
	
//	DECLARING A STATIC METHOD
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
	
	public static void main(String[] args) {
//		CREATING AN OBJECT
		Main main = new Main();
		
//		CALLING A METHOD WITHOUT PARAMETERS
		main.sayHello();
		
//		CALLING A METHOD WITH PARAMETERS
		int sum = main.sum(20, 30);
		System.out.println("Sum of the numbers is: "+sum);
		
//		CALLING A STATIC METHOD
		staticMethod();
	}
}
