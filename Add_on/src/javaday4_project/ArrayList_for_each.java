package javaday4_project;
import java.util.*;
public class ArrayList_for_each {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist =new ArrayList<>();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(300);
		System.out.println(arraylist.get(0));
		System.out.println(arraylist.set(0,1000));
		System.out.println(arraylist.get(0));
		System.out.println(arraylist.remove(0));
		System.out.println(arraylist.get(0));
		
		System.out.println("**********************************");
		for(int i:arraylist) {
		System.out.println(i);
		}
	}

}
