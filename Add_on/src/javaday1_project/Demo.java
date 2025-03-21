package javaday1_project;
import java.util.Scanner;
public class Demo {
 public static void main(String[] args) {
		
	 Scanner s1 = new Scanner(System.in);

		System.out.println("enter a name");

		String name = s1.nextLine();

		System.out.println("my name is " +name);

		System.out.println("enter a mark ");

		int marks=s1.nextInt();

		System.out.println("Mark is "+marks);
	}

}
