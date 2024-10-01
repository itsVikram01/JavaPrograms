package java_codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class ArrayExamples {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int num : arr)
            sum += num;
        System.out.println(sum);


        /************************************** Array Duplicate and Unique Element **********************************************/

        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        Map<Integer, Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));

        System.out.println("Duplicates:");
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        System.out.println("Unique:");
        map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        /*Set<Integer> duplicate = new LinkedHashSet<>();
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            if (!unique.add(num)) {
                unique.remove(num);
                duplicate.add(num);
            }
        }
        out.println("Unique elements : " + unique);
        out.println("Repeating elements : " + duplicate);*/

        /************************************** Array element count **********************************************/

        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
        System.out.println(frequencyMap);


        String[] strs = {"arsh", "arsh", "ashwini", "ashwini", "ashwini", "sea", "red", "green"};
        Map<String, Long> stringCountMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        stringCountMap.forEach((k, v) -> System.out.println(k + " : " + v));


        /************************************** Array Sorting **********************************************/

        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        System.out.println(Arrays.toString(arr));

        /**** using stream ****/
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));

        /**** using IntStream ****/
        int[] sortedArray1 = IntStream.of(arr).boxed().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(sortedArray1));

        /**** using Arrays ****/
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/


        /************************************** Merge Array into List **********************************************/


        int [] arr1 = {4,5,2,6,7};
        int [] arr2 = {9,1,3,8};

        // Convert arrays to streams and merge them
        List<Integer> mergedList = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).collect(Collectors.toList());
        System.out.println("mergedList : "+mergedList);

        // OR

        // convert array to list and merge
        /*List<Integer> mergedList = new ArrayList<>();
        for (int i : arr1) {
            mergedList.add(i);
        }
        for (int i : arr2) {
            mergedList.add(i);
        }
        System.out.println("mergedList : "+mergedList);*/

        // Sort the List using stream and lambda
        mergedList = mergedList.stream().sorted().toList();
        System.out.println("sorted mergedList : "+mergedList);

        //Collections.sort(mergedList);
        //Collections.reverse(mergedList);

/************************************** Array Equality **********************************************/

        int[] array1 = {3, 5, 1, 2, 4, 3};
        int[] array2 = {1, 3, 4, 3, 2, 5};

        boolean areArraysEqual = IntStream.range(0, array1.length)
                .allMatch(i -> Arrays.stream(array2).anyMatch(j -> j == array1[i]));
        /*boolean areArraysEqual = true;
        if (array1.length != array2.length) {
            areArraysEqual = false;
        } else {
            Arrays.sort(array1);
            Arrays.sort(array2);
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areArraysEqual = false;
                    break;
                }
            }
        }*/
        if (areArraysEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }

/************************************** secondSmallest & secondLargest **********************************************/

        int secondSmallest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> a-b) // sorted in descending order. without sorting, it is not possible to find
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(secondSmallest);


        int secondLargest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> b-a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(secondLargest);
    }
}