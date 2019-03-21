package LearningInterface;

// this is multiple  inheritance Method.... 


public class interfaceTest implements showable  {

	public static void main(String[] args) {
		interfaceTest Obj = new interfaceTest ();
	
	Obj.Show();
	Obj.Print();
	Obj.display();
	}

	//Override
	public void Print() {
	System.out.println("this is printable class");	
	}

	//Override
	public void Show() {
	System.out.println("This is Showable class");	
	}
    public void display() {
    	System.out.println("This is public method");
    }
}
