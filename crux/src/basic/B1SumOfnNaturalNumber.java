package basic;

import java.util.Scanner;

public class B1SumOfnNaturalNumber {

	public static Scanner sc;
	public static int toWhere;
	
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		sc = new Scanner(System.in);
		toWhere = sc.nextInt();
		int prev = 0;
		int sum = 0;
		while(prev <= toWhere) {
			sum += prev;
			prev++;
		}
		System.out.println("Sum of first "+toWhere+" natural numbers is: "+sum);
	}

}
