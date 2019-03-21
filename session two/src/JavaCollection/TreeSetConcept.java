package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {
    //maintain the ordering  naturally mins alphabetic or numeric.
	public static void main(String[] args) {
		Set<String> myset = new TreeSet<String>();
		
		myset.add("A1");
		myset.add("B1");
		myset.add("C1");
		myset.add("D1");
		myset.add("E1");
		myset.add("B1");
		myset.add("A1A");
		System.out.println("Size of myset is "+myset.size());
		System.out.println(myset);
	
	//useing for each loop.
	for(String item : myset) {
		System.out.println(item);
	}
	
	
	
	}

}
