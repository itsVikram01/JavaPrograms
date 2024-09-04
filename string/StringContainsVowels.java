package java_codes.string;

import static java.lang.System.*;

public class StringContainsVowels {
	public static void main(String[] args) {
		String str = "Vikram";

		if (str.toLowerCase().matches(".*[aeiou].*")){
			out.println(str + " contains vowels");
		}else {
			out.println(str + " does not contain vowels");
		}
		
	}
}