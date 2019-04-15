package javaInterview;

public class SwapStringValue {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "world";
		a = a+b;
		b = a.replace(b, "");
		a = a.replace(b, "");
		
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		
	}

}
