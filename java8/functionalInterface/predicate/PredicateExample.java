package java_codes.java8.functionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate to check if a number is even
        //Predicate<Integer> isEven = (number) -> number % 2 == 0;


        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = n -> n > 10;

        // Filter even numbers using the predicate
        numbers.stream().filter(isEven).forEach(System.out::println);

        int number = 8;

        System.out.println(isEven.test(number)); // Output: true
        System.out.println(isGreaterThan10.test(number)); // Output: true

        // Combining predicates
        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10);
        System.out.println(isEvenAndGreaterThan10.test(number)); // Output: true
    }
}
