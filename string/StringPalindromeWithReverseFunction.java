package java_codes.string;

import static java.lang.System.*;

public class StringPalindromeWithReverseFunction {
	public static void main(String[] args) {
        String str = "abcba";

        String reverse = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reverse)) {
            out.println(str + " is a palindrome.");
        } else {
            out.println(str + " is not a palindrome.");
        }
    }
}
