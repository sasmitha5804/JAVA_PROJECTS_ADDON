package javaday2_project;
import java.util.*;
public class StringMethods {
public static void main(String[]args) {
	 //length()
	  String str="Java programming";
	  System.out.println(str.length());
	  System.out.println(str.substring(3));//starting index
	  System.out.println(str.substring(0,6));
	  System.out.println();
	  
	  //IndexOf()
	  System.out.println(str.indexOf("prog"));
	  System.out.println(str.indexOf("x"));
	  System.out.println();
	  
	  //toUppercase,toLowercase
	  
	  System.out.println(str.toUpperCase());
	  System.out.println(str.toLowerCase());
	  
	  //replace
	  System.out.println(str.replace('a','A'));
	  System.out.println();
	 
	  //equals
	  String str1="JAVA";
	  String str2="java";
	  System.out.println(str1==str2);
	  System.out.println(str1.equals(str2));
	  System.out.println(str1.equalsIgnoreCase(str2));
	  System.out.println();
	  
	  //charAt
	  System.out.println(str1.charAt(3));
	  System.out.println();
	 
	  //split
	  
	  String str3="Java,Python,springBoot";
	  String [] language= str3.split(",");
	  
	  for(String s1:language) {
		  System.out.println(s1);
	  }
	  System.out.println();
	  
	  //Concatenation
	  
	  String a="Java";
	  String a1="Programming";
	  System.out.println("Concatenated String:"+a.concat(a1));
	  System.out.println();
	  
	  //trim()
	  String a2="  Java  ";
	  System.out.println(a2.length());
	  String b1=a2.trim();
	  System.out.println(b1);
	  System.out.println(b1.length());
	  System.out.println();
	  
	  //compareTo
	  System.out.println(a.compareTo(a1));
	  System.out.println(a.compareTo(a2));
	  System.out.println();
	  
	  //contains
	  String c="Java Programming";
	  System.out.println(c.contains("Java"));
	  System.out.println(c.contains("Programming"));
	  System.out.println();
	  
	  //intern
	  
	  String x=new String("JavaDeveloper");
	  String y="JavaDeveloper";
	  String z=x.intern();
	  System.out.println(x==y);
	  System.out.println(y==z);
}
}
