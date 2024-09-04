package java_codes._javaprogram;

import static java.lang.System.*;

public class Double1For30Days {
    public static void main(String[] args) {
        long value = 1;

        for (int i = 1; i <= 30; i++) {
            value = value * 2;
            out.println(" Day " + i + "  value : " + (value/2) + " * " + 2 + " = " + value);
        }
        // 1073741824
    }
}
