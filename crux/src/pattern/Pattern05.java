package pattern;

import java.util.Scanner;

public class Pattern05 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<rows; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
