package javaday3_project;
import java.util.*;
public class methods {
  public static int add(int a,int b) {
	  return a+b;
	  
  }
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the values:");
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println(add(a,b));

	}

}
