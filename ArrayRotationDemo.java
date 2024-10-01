package java_codes;

import java.util.Arrays;

public class ArrayRotationDemo {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println("Original array is : " + Arrays.toString(arr));

		int k=3;

		/*rotateRight(arr, k);
		System.out.println("rotateRight : "+Arrays.toString(arr));*/

		rotateLeft(arr, k);
		System.out.println("rotateLeft : "+Arrays.toString(arr));
	}

	private static void rotateRight(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		reverse(arr, 0, (n-1));
		reverse(arr, 0, (k)-1);
		reverse(arr, (k), (n-1));
	}

	private static void rotateLeft(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		reverse(arr, 0, (n-1));
		reverse(arr, 0, (n-k)-1);
		reverse(arr, (n-k), (n-1));
	}

	private static void reverse(int[] arr, int i, int l) {
		while (i < l) {
			int temp = arr[i];
			arr[i] = arr[l];
			arr[l] = temp;
			i++;
			l--;
		}
	}
}
