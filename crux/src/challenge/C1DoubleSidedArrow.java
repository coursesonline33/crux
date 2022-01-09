package challenge;

import java.util.Scanner;

public class C1DoubleSidedArrow {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		int rowCounter = 1;
		int nsp1 = 2 * rows - 2;
		int nst1 = 1;
		int nsp2 = -2;
		int nst2 = 1;
		if(rows%2 == 0) {
			System.out.println("PLEASE ENTER ODD NUMBERS ONLY.");
		}
		else {
			while(rowCounter <= rows) {
				int value = 0;
				if(rowCounter <= rows/2+1) {
					value = rowCounter;
				}
				else {
					value = rows - rowCounter/2 - 2;
				}
				int value1 = 1;
				for(int i=0; i<nsp1; i++) {
					System.out.print("\t");
				}
				for(int i=0; i<nst1; i++) {
					if(rowCounter == rows) {
						System.out.print("1\t");
					}
					else {
						System.out.print(value+"\t");
					}
					value--;
				}
				for(int i=0; i<nsp2; i++) {
					System.out.print("\t");
				}
				if(rowCounter != 1 && rowCounter != rows) {
					for(int i=0; i<nst2; i++) {
						System.out.print(value1+"\t");
						value1++;
					}
				}
				System.out.println();
				if(rowCounter <= rows/2) {
					nsp1 -= 4;
					nst1 += 1;
					nsp2 += 4;
					nst2 += 1;
				}
				else {
					nsp1 += 4;
					nst1 -= 1;
					nsp2 -= 4;
					nst2 -= 1;
				}
				rowCounter++;
			}
		}
	}

}
