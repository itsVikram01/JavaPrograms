package java_codes._javaprogram;

import java.util.Random;

public class RandomNo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10) + 1;
            System.out.println(randomNumber);
        }
    }
}
