package datastructures.datastructures.sorting;

import java.util.Arrays;
//Time Complexity is O(n*log(n))
//Space Complexity is O(n)
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {4,9,6,2,8,-1,-10};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		System.out.println("After Sorting : " + Arrays.toString(mergeSort(arr)));
	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length == 1) return arr;
		int mid = (0 + arr.length)/2;
		int[] firstArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] secondArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));	
		return merge(firstArr, secondArr);
	}
	
	public static int[] merge(int[] firstArr, int[] secondArr) {
		int i=0,j=0,k=0;
		int[] mergeArr = new int[firstArr.length + secondArr.length];
		
		while(i<firstArr.length && j<secondArr.length) {
			if(firstArr[i] < secondArr[j]) {
				mergeArr[k] = firstArr[i];
				i++;
			}else {
				mergeArr[k] = secondArr[j];
				j++;
			}
			k++;
		}
		while(i<firstArr.length) {
			mergeArr[k] = firstArr[i];
			i++;
			k++;
		}
		while(j<secondArr.length) {
			mergeArr[k] = secondArr[j];
			j++;
			k++;
		}
		return mergeArr;
	}

}
