package javaday3_project;
import java.util.*;
class Hotel{
	static String recipe="Biriyani";
	 static int quantity=1;
	 static int price;
	public static  void items(){
		System.out.println("Recipe:"+recipe);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
	}
}
public class task {
  public static void main(String[]args) {
	  Hotel obj=new Hotel();
	  obj.price=200;
	  obj.items();
	  
  }
}
