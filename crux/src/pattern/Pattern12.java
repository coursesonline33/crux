package pattern;

import java.util.Scanner;

public class Pattern12 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nsp = rows - 1;
		int nst = 1;
		int value = 1;
		while(rowCounter <= rows) {
			for(int i=0; i<nsp; i++) {
				System.out.print("\t");
			}
			for(int i=0; i<nst; i++) {
				System.out.print(value + "\t");
				value++;
			}
			for(int i=0; i<nsp; i++) {
				System.out.print("\t");
			}
			System.out.println();
			rowCounter++;
			nsp -= 1;
			nst += 2;
		}
	}

}
