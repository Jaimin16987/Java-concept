package exception;

import java.util.Scanner;

public class LearningThrow {

	 public static void main(String[] args) {
	   System.out.println("Enter your Age");	
       Scanner userInput = new Scanner(System.in);
        
try {
	      validAge(userInput.nextInt());}
catch(Exception e) {
	   System.out.println(e);
	}

	   System.out.println("Testing Complete");
	}
	
	
	 static void validAge(int age) {
		 if(age < 18) {
			 throw new ArithmeticException("Age is not valid");
		 }
		 else {
			 System.out.println("you are wellcome for voting");
		 }
	}


	

}
