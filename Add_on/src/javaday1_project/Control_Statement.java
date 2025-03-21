package javaday1_project;
import java.util.*;
public class Control_Statement {
	public static void main(String[] args) {

		int a=10;

		int b=20;

		if(a<b) {

			System.out.println("A lessthan B");
           }

		else {

			System.out.println("A Greaterthan B");

		}

		//Nested if

		if(a<b) {

		if(a%2==0) {

			System.out.println(a+ " Even number");

		}

		}

		//else if(Ladder if )

		int m=100;

		int n=200;

		int o=300;

		if (m>n && m>o) {

			System.out.println("M Greater");

		}

		else if (n>m && n>o) {

			System.out.println("N Greater");

		}

		else if (o>n && o>m) {

			System.out.println("O Greater");

		}

		else {

			System.out.println("All are equal");

		}

		System.out.println("\n");

        //Switch

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter value of a1:");

		int a1=s1.nextInt();

		System.out.println("Enter value of a1:");

		int b1=s1.nextInt();

		char choice;

		System.out.println("+,-");

		choice = s1.next().charAt(0);

		switch(choice) {

		case '+':

			int c1=a1+b1;

			System.out.println("Add"+c1);

			break;

		case '-':

			int d1=a1+b1;

			System.out.println("sub"+d1);

			break;

			default:

				System.out.println("Invalid choice");

				break;

		}
	  }
}
