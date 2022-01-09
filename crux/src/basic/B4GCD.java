package basic;

import java.util.Scanner;

public class B4GCD {

	public static Scanner sc;
	public static int dividend, divisor;
	
	public static void main(String[] args) {
		System.out.println("Enter the value of dividend: ");
		sc = new Scanner(System.in);
		dividend = sc.nextInt();
		System.out.println("Enter the value of divisor: ");
		divisor = sc.nextInt();
		int reminder = 0;
		while(dividend%divisor != 0) {
			reminder = dividend % divisor;
			dividend = divisor;
			divisor = reminder;
		}
		System.out.println("GCD: "+divisor);
	}

}
