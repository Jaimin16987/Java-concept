package learningAbstractClass;


public class Abs2 extends Abs1 {

	public static void main(String[] args) {
		
	Abs2 Obj = new Abs2();
	  Obj.M1();
	  Obj.M2();
	  Obj.M3();
	  
	  
	}
	    void M1(){
		System.out.println("M1 abstract method");
	}
	
	    public void M3(){
		System.out.println("M3 non-Abstract method of Abs2");
	}
	}


