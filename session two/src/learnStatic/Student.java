package learnStatic;

public class Student {
    int id;
    String name;
    static String School = "Tecfios";
    
   public Student(int i, String n){ // made a constructor.
	   id = i;
	   name = n;
	   
	   
   }
   // made a non-static display method.
   void display() {
	   System.out.println("ID:"+ id+ "; " + "Name:" + name+ "; " + "School:" +School);
   }
   



}
  