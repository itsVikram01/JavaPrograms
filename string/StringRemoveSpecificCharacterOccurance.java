package java_codes.string;

public class StringRemoveSpecificCharacterOccurance {

	public static void main(String[] args) {
		String str1 = "abcdABCDabcdABCDa";
		
		str1 = str1.replace("a", ""); 

		System.out.println(str1); // bcdABCDbcdABCD
	}

}
