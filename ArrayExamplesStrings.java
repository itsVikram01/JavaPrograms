package java_codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayExamplesStrings {
    public static void main(String[] args) {

/************************************** Array element count **********************************************/

        String[] strs = {"arsh", "arsh", "ashwini", "ashwini", "ashwini", "sea", "red", "green"};
        Map<String, Long> stringCountMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println(stringCountMap);

        /* ******************************************************************************************** */

        /* filter ByName */
        Arrays.stream(strs)
                .filter(name -> name.equals("ashwini"))
                .forEach(System.out::println);

        /* ******************************************************************************************** */

        /* Filter names that start with 'a' or 'r' */
        Arrays.stream(strs)
                .filter(name -> name.startsWith("a") || name.startsWith("r"))
                .forEach(System.out::println);

        /* ******************************************************************************************** */


        String input = "HeLLo WoRLD";
        System.out.println("Input: " + input);

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
        System.out.println("Output: " + result);
    }
}
