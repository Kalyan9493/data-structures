package datastructures.datastructures.sorting;

import java.util.Arrays;
// Time Complexity is O(n*n)
// Space Complexity is O(1)
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,6,3,2,1,-20};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	public static int[] bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
				}
			}
		}
		return arr;
	}

}
