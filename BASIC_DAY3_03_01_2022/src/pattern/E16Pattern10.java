package pattern;

import java.util.Scanner;

public class E16Pattern10 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nst = 1;
		int nsp = rows - 1;
		while(rowCounter <= rows) {
			for(int i=0; i<nsp; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<nst; i++) {
				System.out.print("1");
			}
			for(int i=0; i<nsp; i++) {
				System.out.print(" ");
			}
			System.out.println();
			nst += 2;
			nsp -= 1;
			rowCounter++;
		}
	}

}
