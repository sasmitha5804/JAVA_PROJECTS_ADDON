package javaday3_project;
import java.util.*;
class Car{
	String brand;
	int count;
	Car(){
		brand="unknown";
	}
	Car(int count){
		this.count=count;
	}
	void display() {
		System.out.println("The Brand name is: "+brand);
		System.out.println("The Car count is : "+count);
	}
}
public class Cons {

	public static void main(String[] args) {
		Car c=new Car();// default constructor
		c.display();
	}

}
