package search_sort;

import java.util.Scanner;

public class SS1LinearSearch {

	static Scanner sc;
	static int arrLength;
	static int elementToFind;
	
	public static void main(String[] args) {
		System.out.println("Enter length of array: ");
		sc = new Scanner(System.in);
		arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		for(int i=0; i<arrLength; i++) {
			System.out.print("Enter element at index "+i+":");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arrLength; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("We are going to perform linear search in the array now, please enter the element you want to search: ");
		elementToFind = sc.nextInt();
		int res = linearSearch(arr, elementToFind);
		System.out.println(res);
	}
	
	public static int linearSearch(int arr[], int elementToFind) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == elementToFind) {
				return i;
			}
		}
		return -1;
	}

}
