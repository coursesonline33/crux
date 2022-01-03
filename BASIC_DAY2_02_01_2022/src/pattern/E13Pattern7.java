package pattern;

import java.util.Scanner;

public class E13Pattern7 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nst = rows/2;
		int nsp = 1;
		while(rowCounter <= rows) {
			// work
			for(int i=0; i<nst; i++) {
				System.out.print("*");
			}
			for(int i=0; i<nsp; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<nst; i++) {
				System.out.print("*");
			}
			System.out.println();
			// prep
			if(rowCounter <= rows/2) {
				nst -= 1;
				nsp += 2;
			}
			else {
				nst += 1;
				nsp -= 2;
			}
			rowCounter++;
		}
	}

}
