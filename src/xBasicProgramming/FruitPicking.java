package xBasicProgramming;

import java.util.Scanner;

public class FruitPicking {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int xFruits = scan.nextInt();
		int xDays = 0;
		while (xFruits % 11 != 1) {
			xFruits *=2;
			xDays++;
		}
		System.out.println(xDays + " " + xFruits);

	}

}
