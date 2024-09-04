package java_codes.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (Arrays.equals(charArray1, charArray2)) {
            out.println(str1 + " and " + str2 + " are Anagram");

        } else {
            out.println(str1 + " and " + str2 + " are Not Anagram");
        }

        /*boolean equals = Arrays.stream(str1.split(""))
                .sorted().collect(Collectors.joining())
                .equals(Arrays.stream(str2.split("")).sorted().collect(Collectors.joining()));
        if (equals) {
            out.println(str1 + " and " + str2 + " are Anagram");

        } else {
            out.println(str1 + " and " + str2 + " are Not Anagram");
        }*/


        /*if (areAnagrams(str1, str2)) {
            out.println("Anagram");
        } else {
            out.println("Not Anagram");
        }*/

    }

    /*private static boolean areAnagrams(String str1, String str2) {int[] count = new int[26];
        char[] arr1=str1.toCharArray();
        for(char ch : arr1){
            count[ch-'a']++;
        }
        char[] arr2=str2.toCharArray();
        for(char ch : arr2){
            count[ch-'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }*/
    /*public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement character frequencies in str2
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }*/
}
