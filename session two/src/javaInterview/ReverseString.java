package javaInterview;

public class ReverseString {

	public static void main(String[] args) {
		// diff between String and StringBuffer.
	// String is a   immutable that's why reverse function not available 	
		String str = "selenium";
		      int leng = str.length();              //using for loop
		String rev ="";
		
		for(int i=leng -1; i>=0; i--){
			rev = rev + str.charAt(i);
			}
       System.out.println(rev);
       
	
		// StringBuffer is a mutable           
       // Using StringBuffer class 
		StringBuffer st = new StringBuffer(str);
	System.out.println(st.reverse());
	

	
	
	
	
	}

}
