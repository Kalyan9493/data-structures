package datastructures.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,3,1,4,6,7,-10,-30,-20};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		System.out.println("After Sorting : " + Arrays.toString(selectionSort(arr)));
	}
	
	public static int[] selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int startIndex = i;
			int minIndex = getMinIndex(arr,startIndex,arr.length);
			if(minIndex > startIndex) 
				arr[startIndex] = arr[startIndex] + arr[minIndex] - (arr[minIndex] = arr[startIndex]);
		}
		return arr;
	}
	
	public static int getMinIndex(int[] arr, int start, int end) {
		int min = start;
		for(int i=start; i<end; i++) 
			if(arr[min] > arr[i]) 
				min = i;
		return min;
	}

}
