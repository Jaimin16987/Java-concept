package exception;

public class LearnTryCatchBlock {

	public static void main(String[] args) {
		try { int i = 50/0 ;
			System.out.println("Value of i is "+i);
		}
	catch(Exception e){
		System.out.println(e);
	}
    finally {
    	System.out.println("finally done");
    }
	}
	}
