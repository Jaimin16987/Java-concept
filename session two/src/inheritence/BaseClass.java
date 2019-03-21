package inheritence;

public class BaseClass {

      int num = 20;
 String str = "Jay";
 static boolean tf = true;
 
     public static void abc() {
	  System.out.println("public static method abc");
	 }
  
    public void test() {
	   System.out.println("defoult access modifier non-static");
	   
   }
   protected int add(int i, int n) {
	   int result = i+n; 
		  return result;
	  
   } 
 private void  personal() {   
	 System.out.println("this is private method");
 }





}
