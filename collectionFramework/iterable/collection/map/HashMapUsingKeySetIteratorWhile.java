package java_codes.collectionFramework.iterable.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapUsingKeySetIteratorWhile {
    public static void main(String args[]) {
        
	    // Creating a HashMap of String keys and String values
	    HashMap<String, String> hashmap = new HashMap<String, String>();
	    hashmap.put("Key1", "Value1");
	    hashmap.put("Key2", "Value2");
	    
	    // Iterating or looping using keySet() method
	    System.out.println("Iterating or looping map using keySet Iterator");
	    Set<String> keySet = hashmap.keySet();
	    Iterator<String> keySetIterator = keySet.iterator();
	    while (keySetIterator.hasNext()) {
	        String key = keySetIterator.next();
	        System.out.println("key: " + key + " value: " + hashmap.get(key));
	    }
    }
}