package inheritence;

public class SubClass extends BaseClass {

	public static void main(String[] args) {
		
     abc();                // static method
     System.out.println(tf); // static method
     SubClass obj = new SubClass(); //made an object for run the non-static method
     obj.test();
     
	}


   public void test() {  //non-static method
	System.out.println(str);
	System.out.println(num);
	add(10,5);
	System.out.println(add(10,5));
	//personal(); // for print this method need to change access modifier.
}






}
