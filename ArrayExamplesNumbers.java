package java_codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class ArrayExamplesNumbers {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        //System.out.println(Arrays.toString(arr));

        /************************************** Array element count **********************************************/

        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(frequencyMap);

        /************************************** Array Duplicate and Unique Element **********************************************/

        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println("Duplicates:");
        map.forEach((k, v) -> {
            if (v > 1){
                System.out.println(k);
            }
        });

        System.out.println("Unique:");
        map.forEach((k, v) -> {
            if (v == 1) {
                System.out.println(k);
            }
        });

        /*Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .forEach((key, count) -> {
                    if(count > 1){
                        System.out.println("Duplicate key : " + key);
                    }
                    *//*if(count == 1){
                        System.out.println("Unique key : " +  key);
                    }*//*
                });*/

        /*Set<Integer> duplicate = new LinkedHashSet<>();
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            if (!unique.add(num)) {
                unique.remove(num);
                duplicate.add(num);
            }
        }
        System.out.println("Unique elements : " + unique);
        System.out.println("Repeating elements : " + duplicate);*/

        /************************************** Array Sorting **********************************************/

        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        /**** using stream ****/
        /*int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));*/

        /**** using IntStream ****/
        /*int[] sortedArray1 = IntStream.of(arr).boxed().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(sortedArray1));*/

        /**** using Arrays ****/
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/


        /************************************** Merge Array into List **********************************************/


        int[] arr1 = {3, 5, 1, 2, 4, 3};
        int[] arr2 = {1, 3, 4, 3, 2, 5};
        System.out.println("arr1 : "+ Arrays.toString(arr1));
        System.out.println("arr2 : "+ Arrays.toString(arr2));

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

        // Sort the mergedList using stream
        /*mergedList = mergedList.stream().sorted().toList();
        System.out.println("sorted mergedList : "+mergedList);*/

        //Collections.sort(mergedList);
        //Collections.reverse(mergedList);

/************************************** Array Equality **********************************************/

        /*int[] arr1 = {3, 5, 1, 2, 4, 3};
        int[] arr2 = {1, 3, 4, 3, 2, 5};*/

        /*boolean areArraysEqual = IntStream.range(0, arr1.length)
                .allMatch(i -> Arrays.stream(arr2).anyMatch(j -> j == arr1[i]));
        if (areArraysEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }*/

        /*boolean areArraysEqual = true;
        if (arr1.length != arr2.length) {
            areArraysEqual = false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areArraysEqual = false;
                    break;
                }
            }
        }
        if (areArraysEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }*/

/************************************** secondSmallest & secondLargest **********************************************/

        /*int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};*/

        /*int secondSmallest = Arrays.stream(arr).boxed()
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
        System.out.println(secondLargest);*/

/************************************** sum of array elements **********************************************/

        /*int sum = 0;
        for (int num : arr)
            sum += num;
        System.out.println(sum);*/

    }
}