package basic;

import java.util.Scanner;

public class E2PrimeNumber {
	
	public static Scanner sc;
	public static int number;

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		sc = new Scanner(System.in);
		number = sc.nextInt();
		int counter = 2;
		while(counter < number-1) {
			if(number%counter == 0) {
				System.out.println(number+" is NOT PRIME");
				return;
			}
			counter++;
		}
		System.out.println(number+" is PRIME");
	}

}
