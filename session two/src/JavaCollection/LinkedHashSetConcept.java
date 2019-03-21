package JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
    // maintain the order of the programmer.
	public static void main(String[] args) {
		Set<String> linkedset = new LinkedHashSet<String>();
		
		linkedset.add("A1");
		linkedset.add("B1");
		linkedset.add("C1");
		linkedset.add("D1");
		linkedset.add("E1");
		linkedset.add("B1");
		linkedset.add("A1A");
		System.out.println("Size of myset is "+linkedset.size());
		System.out.println(linkedset);
	}

}
