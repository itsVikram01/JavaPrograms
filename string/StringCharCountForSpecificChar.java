package java_codes.string;

import static java.lang.System.*;

public class StringCharCountForSpecificChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        long count = str.chars().filter(c -> c == ch).count();
        out.println(ch + " : " + count);

        /*int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(ch + " : " + count);*/
    }
}
