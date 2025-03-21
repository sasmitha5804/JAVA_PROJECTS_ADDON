package javaday4_project;
import java.util.*;
public class Collections_Hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//Adding key value pairs
		map.put("Apple",3);
		map.put("Banana",2);
		map.put("Orange",1);
		System.out.println("HashMap:"+map);
		System.out.println();
		
		System.out.println("Apple count:"+map.get("Apple"));
		map.remove("Orange");
		System.out.println("Aftre removing Orange"+map);
		System.out.println();
		
		System.out.println("Iterating using entryset:");
		for(Map.Entry<String,Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
			System.out.println("Iterating using Keyset:");
			for(String key:map.keySet()) {
				System.out.println(key+":"+map.get(key));
			}
		}
		
		
	}

}
