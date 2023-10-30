package typeCasting;

public class Main {
	public static void main(String[] args) {
		int num = 20;
		System.out.println(num);
		
//		IMPLICIT TYPE CASTING
		double num1 = num;
		System.out.println(num1);
		
//		EXPLICIT TYPE CASTING
		int num2 = (int) num1;
		System.out.println(num2);
		
	}

}
