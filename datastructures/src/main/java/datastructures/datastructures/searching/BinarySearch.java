package datastructures.datastructures.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-20,-10,0,10,20,50,55,60,70};
		System.out.println("--------------Using Loop-------------");
		System.out.println(binarySearchUsingLoop(arr,10));
		System.out.println(binarySearchUsingLoop(arr,70));
		System.out.println(binarySearchUsingLoop(arr,55));
		System.out.println(binarySearchUsingLoop(arr,-10));
		System.out.println(binarySearchUsingLoop(arr,-110));
		System.out.println("-------------Using Recursion----------");
		System.out.println(binarySearchUsingRecursion(arr,10,0,arr.length-1));
		System.out.println(binarySearchUsingRecursion(arr,70,0,arr.length-1));
		System.out.println(binarySearchUsingRecursion(arr,55,0,arr.length-1));
		System.out.println(binarySearchUsingRecursion(arr,-10,0,arr.length-1));
		System.out.println(binarySearchUsingRecursion(arr,-110,0,arr.length-1));
	}
	
	public static int binarySearchUsingLoop(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low <= high) {
			mid = (low+high)/2;
			if(arr[mid] == target) return mid;
			if(target < arr[mid]) {
				high = mid-1;
			}
			if(target > arr[mid]) {
				low = mid+1;
			}
		}
		return -1;
	}
	public static int binarySearchUsingRecursion(int[] arr, int target,int low, int high) {
		if(high > 0) {
			int mid= (low+high)/2;
			if(arr[mid] == target) return mid;
			if(target < arr[mid]) return binarySearchUsingRecursion(arr,target,low,mid-1);
			if(target > arr[mid]) return binarySearchUsingRecursion(arr,target,mid+1,high);
		}
		return -1;
	}

}
