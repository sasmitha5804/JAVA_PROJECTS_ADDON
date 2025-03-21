package javaday4_project;
import java.util.*;
public class Collections_Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(100);
		l.add(200);
		l.addFirst(500);
		l.addLast(50);
		l.add(400);
		l.remove(1);
		System.out.println(l);
	}

}
