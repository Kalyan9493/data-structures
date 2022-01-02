package datastructures.datastructures.sorting;

import java.util.Arrays;
//Time Complexity is O(n*n)
//Space Complexity is O(1)
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,2,3,4,1,-1,-13};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		System.out.println("After Sorting : " + Arrays.toString(insertionSort(arr)));
	}
	
	public static int[] insertionSort(int[] arr) {
		// Correct but not make sense  for me
//        for (int i = 1; i < arr.length; i++) {
//            int j = i - 1;
//            while (j >= 0 && arr[j] > arr[i]) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = arr[i];
//        }
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					arr[j] = arr[j] + arr[j-1] - (arr[j-1] = arr[j]);
				}else {
					break;
				}
			}
		}
		return arr;
	}

}
