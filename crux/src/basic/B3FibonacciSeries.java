package basic;

import java.util.Scanner;

public class B3FibonacciSeries {

	public static Scanner sc;
	public static int toWhere;
	
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		sc = new Scanner(System.in);
		toWhere = sc.nextInt();
		int first = 0;
		int second = 1;
		int counter = 0;
		System.out.print(first+" "+second+" ");
		while(counter < toWhere) {
			int third = first + second;
			System.out.print(third+" ");
			first = second;
			second = third;
			counter++;
		}
	}

}
