package pattern;

import java.util.Scanner;

public class E22Pattern16 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nst = 1;
		int nsp = rows - 2;
		while(rowCounter <= rows) {
			if(rowCounter == 1 || rowCounter == rows ) {
				for(int i=0; i< rows; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
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
			}
			rowCounter++;
		}
	}

}
