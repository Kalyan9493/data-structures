package datastructures.datastructures.sorting;

import java.util.Arrays;
//Average Case Time Complexity is O(n*log(n))
//Space Complexity is O(n)
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {4,9,6,2,8,-1,-10};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		System.out.println("After Sorting : " + Arrays.toString(quickSort(arr,0,arr.length-1)));
	}

	public static int[] quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int partitionIndex = getPartitionIndex(arr,low,high);
			quickSort(arr, low,partitionIndex-1);
			quickSort(arr,partitionIndex+1,arr.length-1);
		}
		return arr;
	}
	
	public static int getPartitionIndex(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j) {
			while(arr[i] <= pivot) i++;
			while(arr[j] > pivot) j--;
			if(i < j)
			arr[i]= arr[i] + arr[j] - (arr[j] = arr[i]);
		}
		if(i>j)
		arr[j]= arr[j] + arr[low] - (arr[low] = arr[j]);
		return j;
	}
}
