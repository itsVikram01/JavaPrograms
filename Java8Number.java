package java_codes;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Number {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        System.out.println("Original array is : " + Arrays.toString(arr));

        /* ArrayDuplicateAndUniqueElements */
        /*Map<Integer, Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();
        map.keySet().forEach(key -> {
            if (map.get(key) == 1) {
                uniqueList.add(key);
            } else {
                duplicateList.add(key);
            }
        });
        System.out.println("Unique Elements in  Array : " + uniqueList);
        System.out.println("Duplicate Elements in  Array : " + duplicateList);*/


        /* ArrayElementFrequencyInteger */
        /*Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(frequencyMap);*/

        /* ArrayElementsNthNonRepeatingElement */
        /*Map<Integer, Long> frequencyMap1 = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        int nth = 4;
        int count = 0;
        for (int num : arr) {
            if (frequencyMap1.get(num) == 1) {
                count++;
                if (count == nth) {
                    System.out.println(nth + " non-repeating element is : " + num);
                    return;
                }
            }
        }*/

        /* ArraySecondSmallestAndSecondLargestElement */
        /*int secondSmallest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> a-b) // sorted in descending order. without sorting, it is not possible to find
                .distinct().skip(1).findFirst().orElse(-1);
        System.out.println("secondSmallest : " + secondSmallest);

        int secondLargest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> b-a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct().skip(1).findFirst().orElse(-1);
        System.out.println("secondLargest : "+secondLargest);*/




        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);

        List<Integer> listKey = new ArrayList<>(map.keySet());
        System.out.println(listKey);

        List<Integer> listValues = new ArrayList<>(map.values());
        System.out.println(listValues);

        //int maxKey = map.keySet().stream().max(Integer::compare).orElse(0);
        int maxKey = map.keySet().stream().max((a,b) -> a-b).orElse(0);
        System.out.println(maxKey);
        //int minKey = map.keySet().stream().min(Integer::compare).orElse(0);
        int minKey = map.keySet().stream().min((a,b) -> a-b).orElse(0);
        System.out.println(minKey);

        //int maxVal = map.values().stream().max(Integer::compareTo).orElse(0);
        int maxVal = map.values().stream().max((a,b) -> a-b).orElse(0);
        System.out.println(maxVal);
        //int minVal = map.keySet().stream().min(Integer::compare).orElse(0);
        int minVal = map.keySet().stream().min((a,b) -> a-b).orElse(0);
        System.out.println(minVal);




        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		/* . filter(Predicate<T> predicate):
			Returns a stream consisting of the elements that match the given predicate. */

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);  // 2, 4

		/* . sorted():
			Returns a stream with the elements sorted in natural order or using a custom comparator. */

        numbers.stream().sorted().forEach(System.out::println);

		/* . limit(long maxSize):
			Returns a stream consisting of the first maxSize elements. */

        numbers.stream().limit(3).forEach(System.out::println);

		/* . skip(long n):
			Skips the first n elements and returns the remaining ones. */

        numbers.stream().skip(2).forEach(System.out::println);

		/* . peek(Consumer<T> action):
			Useful for debugging, this method allows performing some action on each element as it is consumed by the stream. */

        numbers.stream().peek(System.out::println).collect(Collectors.toList());


    }
}
