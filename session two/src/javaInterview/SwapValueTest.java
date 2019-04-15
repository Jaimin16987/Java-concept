package javaInterview;

public class SwapValueTest {

	public static void main(String[] args) {
	// this following code swap the value without use 3rd variable	
		int a = 20;
		int b = 10;
	//without using third variable: using + operator
		a = a+b; //30
		b = a-b; //20
		a = a-b; //10
	// by using * operator	
//		a = a*b; //200
//		b = a/b; //20
//		a = a/b; //10
	// by using XOR operator
//		a = a^b;
//		b = a^b;
//		a = a^b;
		
		
		System.out.println("Valu of a "+ a);
		System.out.println("Valu of b "+ b);
	}

}
