package xBasicProgramming;

import java.util.Scanner;

public class Infinity {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xLastNumber = scan.nextInt();
		int xValueRange = 1;
		while (xValueRange != xLastNumber) {
			System.out.println(xValueRange);
			xValueRange++;
		}
		if (xValueRange == xLastNumber) {
			System.out.println(xValueRange);
		}
		
	}

}
