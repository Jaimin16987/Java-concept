package javaInterview;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your no");
		int no = s.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(no +" * " +i+ " = " +no*i);
			
		}

	}

}
