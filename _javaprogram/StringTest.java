package java_codes._javaprogram;

import java.util.Comparator;

public class StringTest{
    public static void main(String[] args) {

        String name = "Alice";
        System.out.println(name.length()); // 5

        String str1 = "Hi";
        String str2 = "Hi";
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("Welcome");
        String str4 = new String("Welcome");
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true


        String name1 = "Bob";
        String name2 = "bob";
        System.out.println(name1.equals(name2)); // false
        System.out.println(name1.equalsIgnoreCase(name2)); // true

        String original = "Welcome";
        String modified = original.concat(" Home"); // Welcome Home (doesn't change original)
        System.out.println(original); // Welcome
        System.out.println(modified); // Welcome Home

        String sentence = "Find the word 'word'";
        int firstIndex = sentence.indexOf("word");
        int lastIndex = sentence.lastIndexOf("word");
        System.out.println(firstIndex); // Output: 9
        System.out.println(lastIndex); // Output: 15

        String text = "MiXeD CaSe";
        String upperCase = text.toUpperCase();
        String lowerCase = text.toLowerCase();
        System.out.println(upperCase); // MIXED CASE
        System.out.println(lowerCase); // mixed case


        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println(reversed); // olleH


        Comparator<Integer> comparator = (a, b) -> a - b;
        System.out.println(comparator.compare(100,20)); // 80


        String input = "HeLLo WoRLD";
        System.out.println("Input: " + input); // Input: HeLLo WoRLD

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                // If it's not an alphabet character, keep it unchanged
                result.append(c);
            }
        }
        System.out.println("Output: " + result); // Output: hEllO wOrld
    }

}
