package javaInterview;

public class SwapValueTest {

	public static void main(String[] args) {
	// this following code swap the value without use 3rd variable	
		int a = 20;
		int b = 10;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		
		System.out.println("Valu of a "+ a);
		System.out.println("Valu of b "+ b);
	}

}
