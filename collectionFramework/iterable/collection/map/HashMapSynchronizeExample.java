package java_codes.collectionFramework.iterable.collection.map;

import java.util.*;

public class HashMapSynchronizeExample {
	public static void main(String[] args) {
		// Creating a HashMap of Integer keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(4, "Value4");
		hashmap.put(5, "Value5");
		hashmap.put(1, "Value1");
		hashmap.put(2, "Value2");
		hashmap.put(3, "Value3");
		System.out.println("hashmap : "+hashmap);
		
		Map<Integer, String> map = Collections.synchronizedMap(hashmap);
		System.out.println("map : "+map);
		Set<?> set = map.entrySet();
		System.out.println("set : "+set);
		
		synchronized (map) {
			Iterator<?> i = set.iterator();
			// Display elements
			while (i.hasNext()) {
				@SuppressWarnings("unchecked")
				Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) i.next();
				System.out.print(entry.getKey() + ": ");
				System.out.println(entry.getValue());
			}
		}
	}
}