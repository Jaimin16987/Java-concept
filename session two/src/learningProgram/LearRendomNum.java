package learningProgram;

import java.util.Random;

public class LearRendomNum {

	public static void main(String[] args) {
		
	
	 Random rnum = new Random();
	 int counter = rnum.nextInt(200);
     
	 System.out.println("Random Numbers:");
     
	 System.out.println("===========");
     
     for (counter = 1; counter <= 5; counter++) {
        System.out.println(rnum.nextInt(200));
     
     }
	
	
	
	
	}

}
