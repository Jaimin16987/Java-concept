package encapsulation;

public class Car {
 private String make = "audi";
 
                     // getter and setter method.
 public void getMake(){
	 System.out.println(make);
     
 }

public void setMake(String make){
	this.make = make;    //"this" mins the class name.
    
}
}
