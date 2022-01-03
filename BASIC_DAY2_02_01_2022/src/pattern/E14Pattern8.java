package pattern;

import java.util.Scanner;

public class E14Pattern8 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int nsp = rows/2;
		int nst = 1;
		int rowCounter = 1;
		while(rowCounter <= rows) {
			for(int i=0; i<nsp; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<nst; i++) {
				System.out.print("*");
			}
			for(int i=0; i<nsp; i++) {
				System.out.print(" ");
			}
			System.out.println();
			if(rowCounter <= rows/2) {
				nsp -= 1;
				nst += 2;
			}
			else {
				nsp += 1;
				nst -= 2;
			}
			rowCounter++;
		}
	}

}
