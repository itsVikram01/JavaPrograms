package java_codes.collectionFramework.iterable.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapUsingEntrySetIterator {
    public static void main(String args[]) {
        
    // Creating a HashMap of String keys and String values
    HashMap<String, String> hashmap = new HashMap<String, String>();
    hashmap.put("Key1", "Value1");
    hashmap.put("Key2", "Value2");
    
    // Iterating or looping using entrySet() method
    System.out.println("Iterating or looping map using entrySet and Iterator");
    Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
    Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
    while (entrySetIterator.hasNext()) {
        Map.Entry<String, String> entry = entrySetIterator.next();
        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
    }
  }
}