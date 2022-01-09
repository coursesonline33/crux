package challenge;

import java.util.Scanner;

public class C2InvertedHourGlass {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nsp = 4 * rows;
		int nst = 1;
		int value = 5;
		while(rowCounter <= rows) {
			for(int i=0; i<nst; i++) {
				System.out.print(value);
				value--;
			}
			for(int i=0; i<nsp; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<nst; i++) {
				System.out.print(value);
			}
			System.out.println();
			rowCounter++;
		}
	}

}
