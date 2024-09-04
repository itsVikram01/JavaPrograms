package java_codes.collectionFramework.iterable.collection.map;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSortByKey {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("B", 3);
		map.put("C", 1);
		map.put("A", 2);

		List<String> key = new ArrayList<>(map.keySet());
		Collections.sort(key);
		System.out.println("Sorted Map by Keys : "+key);

		/*System.out.println("Sorted Map by Keys using java8 : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey()));*/

		/*Map<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Sorted Map by Keys with value : " + sortedMap);*/
	}
}
