package pattern;

import java.util.Scanner;

public class Pattern01 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
