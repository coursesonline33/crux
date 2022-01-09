package pattern;

import java.util.Scanner;

public class Pattern00 {

	public static Scanner sc;
	public static int rows;
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		for(int i=0; i<rows; i++) {
			System.out.println("Row "+i+" *");
		}
	}

}
