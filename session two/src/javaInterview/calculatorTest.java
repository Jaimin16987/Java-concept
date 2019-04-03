package javaInterview;
import java.util.Scanner;

public class calculatorTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no");
		int no1 = s.nextInt();
		System.out.println("enter second no");
		int no2 = s.nextInt();
		System.out.println("enter symbol(+,-,*,/)");
		String sym = s.next();
		int result;
		
		switch(sym) {
		
		case "+" : result = no1 + no2;
		System.out.println("Addition is "+result);
		break;
		case "-" : result = no1 + no2;
		System.out.println("Subtraction is "+result);
		break;
		case "*" : result = no1 + no2;
		System.out.println("multiplication is "+result);
		break;
		case "/" : result = no1 + no2;
		System.out.println("devision is "+result);
		break;
		default : System.out.println("invalid symbol");
		break;
		
		
		
		}

	}

}
