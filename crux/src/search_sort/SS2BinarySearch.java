package search_sort;

import java.util.Scanner;

public class SS2BinarySearch {

	static Scanner sc;
	static int arrLength;
	static int elementToFind;
	
	public static void main(String[] args) {
		System.out.println("Enter length of array: ");
		sc = new Scanner(System.in);
		arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		System.out.println("DISCLAIMER: THE ARRAY MUST BE SORTED IN INCREASING OR DECREASING ORDER");
		System.out.println();
		for(int i=0; i<arrLength; i++) {
			System.out.print("Enter element at index "+i+":");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arrLength; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("We are going to perform binary search on a array now, please enter the element you want to search: ");
		elementToFind = sc.nextInt();
		int res = binarySearch(arr, elementToFind);
		System.out.println(res);
	}
	
	public static int binarySearch(int arr[], int elementToFind) {
		// 1,2,3,4,5,6 -> 5
		// low -> 0
		// high -> 5
		// mid -> 2
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] > elementToFind) {
				high = mid - 1;
			}
			else if(arr[mid] < elementToFind) {
				low = mid + 1;
			}
			else {
				return mid;	
			}
		}
		return -1;
	}

}
