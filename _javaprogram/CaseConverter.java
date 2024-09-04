package java_codes._javaprogram;

public class CaseConverter {
    public static void main(String[] args) {
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