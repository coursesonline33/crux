package pattern;

import java.util.Scanner;

public class E19Pattern13 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nsp = rows - 1;
		int nst = 1;
		while(rowCounter <= rows) {
			int value = 1;
			for(int i=0; i<nsp; i++) {
				System.out.print("\t");
			}
			for(int i=1; i<=nst; i++) {
				System.out.print(value + "\t");
				if(i <= nst/2) {
					value++;
				}
				else {
					value--;
				}
			}
			for(int i=0; i<nsp; i++) {
				System.out.print("\t");
			}
			System.out.println();
			rowCounter++;
			nst += 2;
			nsp -= 1;
		}
	}

}
