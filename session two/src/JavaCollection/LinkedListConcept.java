package JavaCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {
	    // child of List interface.
		//its allowed duplicate value/elements
		// its maintain insertion order
	public static void main(String[] args) {
		
		LinkedList<String> L1 = new LinkedList<String>();
		
		L1.add("Test");
		L1.add("Java");
		L1.add("QA");
		L1.add("Admin");
		L1.add("QA");
		L1.add("Dev");
		System.out.println(L1);
		L1.addFirst("selenium");
		System.out.println(L1);
		L1.removeFirst();
		System.out.println(L1);
		System.out.println("================");
		//different way to print all the value of linkedList
		//for loop
		for(int i=0;i<L1.size();i++){
			System.out.println(L1.get(i));
		}
//		//advance for loop
//		System.out.println("=> print with advance for loop (each)");
//		for(String j:L1){
//			System.out.println(j);
//		}
		//iterator
//		System.out.println("=> print with iterator");
//		Iterator<String> it = L1.iterator();
//		 while(it.hasNext()){
//			 System.out.println(it.next());
//		 }
		
		
	}

}
