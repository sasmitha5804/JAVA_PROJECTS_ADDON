package javaday3_project;
import java.util.*;
//creation of class
class student{
	String name ="Ram";
	int rollno =41;
	String dept="SS";
	String year="III";
	
	void displayData() {
		System.out.println("My Name is: "+name);
		System.out.println("Roll Number : "+rollno);
		System.out.println("Department : "+dept);
		
	}
	void print() {
		System.out.println("Year: " + year);
	}
}
public class OOPS {
 public static void main(String[]args) {
	 //creation of object  for class
	 student s1 = new student();
	 student s2 = new student();
	 s1.displayData();
	 s2.print();
	 
 }
}
