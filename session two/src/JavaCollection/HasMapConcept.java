package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class HasMapConcept {
// same as hasset no maintain order.
	
	public static void main(String[] args) {
		
		Map<Integer, String> mymap1 = new HashMap<Integer, String>();
		
        mymap1.put(1, "test");
        mymap1.put(5, "admin");
        mymap1.put(9, "dev");
        mymap1.put(6, "QA");
        mymap1.put(1, "test2");
        mymap1.put(3, "BA");
        
//        System.out.println(mymap1.size());
//      System.out.println(mymap1);
//        System.out.println(mymap1.keySet());
//        System.out.println(mymap1.values());
//        
        for(int key : mymap1.keySet()){
        	System.out.println(key+" : "+mymap1.get(key));
        }
	}

}
