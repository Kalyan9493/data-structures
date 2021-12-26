package datastructures.datastructures.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,7,4,2,-10,193,-15,9,5,6,3,1,23,4,4,53,332,533,4433,-382};
		int target1 = -15;
		int target2 = 332;
		int target3 = 10;
		System.out.println(linearSearch(arr,target1));
		System.out.println(linearSearch(arr,target2));
		System.out.println(linearSearch(arr,target3));
		
	}
	public static int linearSearch(int[] arr, int target) {
		if(arr.length<0) return -1;
		for(int index=0; index<arr.length; index++)
			if(arr[index] == target)return index;
		return -1;
	}

}
