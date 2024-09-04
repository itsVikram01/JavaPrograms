package java_codes._javaprogram;

public class ArrayElementPairFinder {
    public static void main(String[] args) {
       int[] arr = {0, -1, 2, -3, 1};
       int x= -2;

       boolean pair = checkPair(arr, x);
        System.out.println(pair);


    }

    private static boolean checkPair(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            /*arr[i] = arr[i] + arr[i + 1];
            if(arr[i] == x ){
                return true;
            }*/
            for (int j = i + 1; j < n; j++) {
                arr[j] = arr[j]+arr[i];
                if (arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
