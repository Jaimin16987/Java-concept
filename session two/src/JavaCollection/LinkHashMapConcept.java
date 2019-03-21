package JavaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapConcept {

	public static void main(String[] args) {
		//Same as linkedhashSet maintain programmer order.
		
		Map<Integer, String> mymap2 = new LinkedHashMap<Integer, String>();
	
	     mymap2.put(1, "test");
	        mymap2.put(5, "admin");
	        mymap2.put(9, "dev");
	        mymap2.put(6, "QA");
	        mymap2.put(1, "test2");
	        mymap2.put(3, "BA");
	        
	        System.out.println(mymap2.size());
	        System.out.println(mymap2);
	        System.out.println(mymap2.keySet());
	        System.out.println(mymap2.values());
	        
	        for(int key : mymap2.keySet()){
	        	System.out.println(key+" : "+mymap2.get(key));
	
	        }
	
	
	}

}
