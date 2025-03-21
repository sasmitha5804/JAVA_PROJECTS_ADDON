package javaday4_project;
import java.util.*;
public class Collections_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrlist =new ArrayList<>();
		arrlist.add("IceCream");
		arrlist.add("Brownie");
		System.out.println(arrlist);
		
		ArrayList<Integer> arraylist =new ArrayList<>();
		arraylist.add(100);
		arraylist.add(300);
		System.out.println(arraylist);
		
		ArrayList a =new ArrayList<>();
		a.add(12);
		a.add("Hello");
		System.out.println(a);
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		ArrayList<Integer> a1 =new ArrayList<>();
		for(int i=0;i<=n;i++) {
			a1.add(i);
			System.out.println(a1);
			
			
		}
		
	}

}
