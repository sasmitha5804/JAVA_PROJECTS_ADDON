package javaday2_project;
import java.util.*;
public class StringBulider {

	public static void main(String[] args) {
		//Append
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println("After append:"+sb);
		//Insert
		sb.insert(5, ",");
		System.out.println("After insert:"+sb);
		//replace
		sb.replace(6, 11, "Java");
		System.out.println("After replace:"+sb);
		//reverse
		sb.reverse();
		System.out.println("After reverse:"+sb);
       
		//String Buffer
		// Append
		  StringBuffer sb1 = new StringBuffer("Hello");
		  sb1.append("World");
		  System.out.println("After append: " + sb1);

		  // Insert
		  sb1.insert(5, ",");
		  System.out.println("After insert: " + sb1);

		  // Replace
		  sb1.replace(6, 11, "Java");
		  System.out.println("After replace: " + sb1);

		  // Reverse
		  sb1.reverse();
		  System.out.println("After reverse: " + sb1);
	}

}
