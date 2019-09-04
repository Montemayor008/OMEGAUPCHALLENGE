package xBasicProgramming;

import java.util.Scanner;

public class FruitPicking {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int xFrutas = scan.nextInt();
		int xDias = 0;
		while (xFrutas % 11 != 1) {
			xFrutas *=2;
			xDias++;
		}
		System.out.println(xDias + " " + xFrutas);

	}

}
