package externalData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RWproperites {

	public static void main(String[] args) throws IOException {
		
	String path ="C:\\Users\\patel\\eclipse-workspace\\session two\\src\\externalData\\MyData.properties";
		
		Properties myObj = new Properties();
		FileInputStream fs = new FileInputStream(path);
         myObj.load(fs);
   
         System.out.println(myObj.getProperty("Name"));
         System.out.println(myObj.getProperty("Grade"));
         System.out.println(myObj.getProperty("Class"));
   
   
	}

}
