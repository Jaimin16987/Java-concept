package JavaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
	// kyes are maintain the natural order.
		
		Map<Integer, String> mymap3 = new TreeMap<Integer, String>();
	
	     mymap3.put(1, "test");
	        mymap3.put(5, "admin");
	        mymap3.put(9, "dev");
	        mymap3.put(6, "QA");
	        mymap3.put(1, "test2");
	        mymap3.put(3, "BA");
	        
	        System.out.println(mymap3.size());
	        System.out.println(mymap3);
	        System.out.println(mymap3.keySet());
	        System.out.println(mymap3.values());
	        
	        for(int key : mymap3.keySet()){
	        	System.out.println(key+" : "+mymap3.get(key));
	        

	        }
	}

}
