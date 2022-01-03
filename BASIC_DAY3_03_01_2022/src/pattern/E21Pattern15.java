package pattern;

import java.util.Scanner;

public class E21Pattern15 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nst = 5;
		int nsp = 0;
		while(rowCounter <= rows) {
			for(int i=0; i<nsp; i++) {
				System.out.print("\t");
			}
			for(int i=0; i<nst; i++) {
				System.out.print("*\t");
			}
			System.out.println();
			rowCounter++;
			nst -= 1;
			nsp += 2;
		}
	}

}
