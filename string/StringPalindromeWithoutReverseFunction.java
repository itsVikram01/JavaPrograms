package java_codes.string;

import static java.lang.System.*;

public class StringPalindromeWithoutReverseFunction {
	public static void main(String[] args) {
		String str = "abcba";

    	int length=str.length();

    	for(int i=0; i<length/2; i++) {
    		if (str.charAt(i) != str.charAt(length-i-1)) {
                out.println(str + " is not a palindrome.");
                break;
			}
    	}
		out.println(str + " is a palindrome.");
    }
}