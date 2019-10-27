package xTEEN;

import java.util.Scanner;

public class xChallenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int xTimes = scan.nextInt();
		
		for (int r = 0; r < xTimes; r++) {
			String xString = "AAAAAA";
			xString = scan.next() + "AAAAAA";
			xString.toCharArray();
			
			String xString2 = "AAAAAA";
			xString2 = scan.next() + "AAAAAA";
			xString2.toCharArray();

		
			int xTotal = 1;
		for (int i = 0; i < 6 ; i++) {
			xTotal *= xString.charAt(i)-64;
		}
	//	System.out.println(xTotal);
			int xMod1 = xTotal%47;
	//	System.out.println(xMod1);
		
		int xTotal2 = 1;
		for (int i = 0; i < 6 ; i++) {
			xTotal2 *= xString2.charAt(i)-64;
			
		}
	//	System.out.println(xTotal2);
		int xMod2 = xTotal2%47;
	//	System.out.println(xMod2);
		
		

		if (xMod1 == xMod2) {
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}
		
		}
	}

}
