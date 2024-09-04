package java_codes.collectionFramework.iterable.collection.map;

import java.util.*;

public class HashMapSortByValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("B", 3);
		map.put("C", 1);
		map.put("A", 2);

		List<Integer> values = new ArrayList<>(map.values());
		Collections.sort(values);
		System.out.println("Sorted Map by Value : "+values);

		/*System.out.println("Sorted Map by Value using java8 : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getValue()));*/

		/*Map<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Sorted Map by Value with key : " + sortedMap);*/
	}
}