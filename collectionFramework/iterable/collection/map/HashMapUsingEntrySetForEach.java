package java_codes.collectionFramework.iterable.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapUsingEntrySetForEach {
    public static void main(String[] args) {
        
    // Creating a HashMap of String keys and String values
    HashMap<String, String> hashmap = new HashMap<String, String>();
    hashmap.put("Key1", "Value1");
    hashmap.put("Key2", "Value2");
    
    // Iterating or looping using entrySet() method
    System.out.println("Iterating or looping map using entrySet and foreach loop");
    Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
    for (Map.Entry<String, String> entry : entrySet) {
        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
    }

  }
}