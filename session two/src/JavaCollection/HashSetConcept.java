package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {
     // duplicate values are not allowed.
	 // insertion order is not preserve.
	//HashSet is return randomly  its not follow any order like Asc/Dsc. 
	public static void main(String[] args) {
		Set<String> myset = new HashSet<String>();
		
		myset.add("A1");
		myset.add("B1");
		myset.add("C1");
		myset.add("D1");
		myset.add("E1");
		myset.add("B1");
		myset.add("A1A");
		System.out.println("Size of myset is "+myset.size());
		System.out.println(myset);
	
	

	
	
	}

}
