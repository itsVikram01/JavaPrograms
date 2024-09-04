package java_codes._javaprogram;

public class FirstNonRepeatingNo{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1,3,2,4}; // 1,2,2,3,3,4,4,5

        int[] counts = new int[arr.length];
        for (int num : arr) {
            counts[num]++;
        }
        for (int num : arr) {
            if (counts[num] == 1) {
                System.out.println("First non-repeating number: " + num);
                break;
            }
        }

        /*Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                System.out.println("First non-repeating number: " + num);
                break;
            }
        }*/
    }
}

