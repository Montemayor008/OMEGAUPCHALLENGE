package xTEEN;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int xF = scan.nextInt();
		int xNightCount = 0;
		
		if (xF % 11 == 1) {
			System.out.println(xNightCount);
			System.out.println(xF);
		} else {
			while (xF % 11 != 1) {
			xNightCount++;
			xF = xF*2;
			}
			System.out.println(xNightCount);
			System.out.println(xF);
		}
		

	}

}
