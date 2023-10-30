package accessModifiers;

public class Main {
	public static void main(String[] args) {
		//		CREATEING AN OBJECT
		AccessModifiers acc = new AccessModifiers();

		//		ACCESSING PUBLIC VARIABLE
		System.out.println("Value of public variable: "+acc.publicVariable);
		
//		ACCESSING PRIVATE VARIABLE
//		System.out.println("Value of public variable: "+acc.privateVariable);
//		CANNOT ACCESS PRIVATE VARIABLE
		
//		ACCESSING PROTECTED VARIABLE
		System.out.println("Value of public variable: "+acc.protectedVariable);
		
//		ACCESSING DEFAULT VARIABLE
		System.out.println("Value of public variable: "+acc.defaultVariable);
	}
}
