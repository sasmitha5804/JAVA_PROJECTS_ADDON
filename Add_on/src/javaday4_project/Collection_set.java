package javaday4_project;
import java.util.*;
public class Collection_set {

	public static void main(String[] args) {
		//HashSet
		HashSet <String> h =new HashSet<>();
		h.add("Ram");
		h.add("Ram");
		h.add("Ravi");
		System.out.println(h);
		
		//TreeSet
		
		TreeSet <Integer> T =new TreeSet<>();
		T.add(500);
		T.add(800);
		T.add(200);
		System.out.println(T);

	}

}
