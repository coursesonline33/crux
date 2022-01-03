package pattern;

import java.util.Scanner;

public class E20Pattern14 {
	
	// NOT COMPLETED

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nsp = (2 * rows) - 1;
		int nv = 1;
		int value = 1;
		while(rowCounter <= rows) {
			int nst = 0;
			for(int i=0; i<nv; i++) {
				System.out.print(value+"\t");
				for(int j=0; j<nst; j++) {
					System.out.print("*"+"\t");
				}
				nst++;
			}
			for(int i=0; i<nsp; i++) {
				System.out.print("\t");
			}
			System.out.println();
			rowCounter++;
			value++;
			nv++;
			nsp -= 2;
		}
	}

}
