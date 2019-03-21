package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
    //dynamic ArrayList
	// child of List interface.
	//its allowed duplicate value/elements
	// its maintain insertion order
	// also its not  Synchronized thats why it is slow then other collections
	
	public static void main(String[] args) {
// non-generic method	
	ArrayList obj = new ArrayList();
	
	obj.add(10);
	obj.add("hello");
	obj.add('a');
	obj.add(50);
	obj.add(50);
	System.out.println(obj.size());
	System.out.println(obj.get(1));
	
	for(int i = 0; i<=obj.size()-1;i++){
		System.out.println(obj.get(i));
		
	}
// Generic method
	List<Integer> obj1 = new ArrayList<Integer>();
	
	obj1.add(10);
	obj1.add(25);
	
	ArrayList<String> obj2 = new ArrayList<String>();
	
	obj2.add("hello");
	obj2.add("test");
	
	
	
	}

}
