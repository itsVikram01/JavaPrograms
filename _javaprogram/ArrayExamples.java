package java_codes._javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, -2, 4};
        System.out.println(Arrays.toString(array));

        /************************************** ArraySorting **********************************************************/

        /**** using Arrays ****/
        /*Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/

        /**** using for loop ****/
        /*for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));*/

        /*// Convert array to IntStream, sort, and convert back to array
        //int[] sortedArray = IntStream.of(array).boxed().sorted().mapToInt(Integer::intValue).toArray();

        // Convert the array to a stream, sort it, and collect it back to an array
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        System.out.println(Arrays.toString(sortedArray));*/


        /************************************** Merging Array & Sorting  **********************************************/

        int [] arr1 = {4,5,2,6,7};
        int [] arr2 = {9,1,3,8};

        List<Integer> integerList = new ArrayList<>();
        for (int i : arr1) {
            integerList.add(i);
        }
        for (int i : arr2) {
            integerList.add(i);
        }
        System.out.println("integerList : "+integerList);
        //Collections.sort(integerList);

        // Sort the List using stream and lambda
        integerList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted integerList : "+integerList);

        // Convert List<Integer> back to int[]
        //int[] mergedSortedArray = integerList.stream().mapToInt(i -> i).toArray();

        int[] mergedSortedArray = integerList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("mergedSortedArray : "+Arrays.toString(mergedSortedArray));

        /************************************** ArrayAllElementSum ****************************************************/

        /*int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println(sum);*/



    }
}
