package basic;

import java.util.Scanner;

public class B5ReverseNumber {

	public static Scanner sc;
	public static int number;
	
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		sc = new Scanner(System.in);
		number = sc.nextInt();
		int result = 0;
		while(number != 0) {
			int reminder = number % 10;
			result = result * 10 + reminder;
			number /= 10;
		}
		System.out.println(result);
	}

}
