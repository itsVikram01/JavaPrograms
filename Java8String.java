package java_codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8String {
    public static void main(String[] args) {
        String[] strs = {"arsh", "arsh", "ashwini", "ashwini", "ashwini", "sea", "red", "green"};

        /* stringCountMap */
        Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting())).forEach((k, v) -> System.out.println(k + " : " + v));

        /*  */


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		/* . map(Function<T, R> mapper):
			Transforms each element using the given function and returns a stream of the transformed elements. */

        names.stream().map(String::toUpperCase).forEach(System.out::println);  // ALICE, BOB, CHARLIE

		/* . flatMap(Function<T, Stream<R>> mapper):
			Similar to map(), but the mapper function must return a stream. The result is a flattened stream. */

        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));

        listOfLists.stream().flatMap(List::stream).forEach(System.out::println);  // A, B, C, D

		/* . forEach(Consumer<T> action):
			Performs an action for each element in the stream. */

        names.stream().forEach(System.out::println);

		/* . collect(Collector<T, A, R> collector):
			Converts the elements of the stream into a different form, such as a list, set, or map. */

        //List<String> result = names.stream().collect(Collectors.toList());
        List<String> result = new ArrayList<>(names);
        System.out.println(result);

        /* . toArray(): Collects the elements into an array. */

        //String[] namesArray = names.stream().toArray(String[]::new);
        String[] namesArray = names.toArray(String[]::new);
        System.out.println(Arrays.toString(namesArray));

    }
}
