package xTEEN;

import java.util.Scanner;

public class xChallenge15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int xTimes = scan.nextInt();
		
		String xString = "AAAAAA";
		xString = scan.next() + "AAAAAA";
		xString.toCharArray();
		
		String xString2 = "AAAAAA";
		xString2 = scan.next() + "AAAAAA";
		xString2.toCharArray();
		
		String xString3 = "AAAAAA";
		xString3 = scan.next() + "AAAAAA";
		xString3.toCharArray();
		
		String xString4 = "AAAAAA";
		xString4 = scan.next() + "AAAAAA";
		xString4.toCharArray();
		
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
		
		int xTotal3 = 1;
		for (int i = 0; i < 6 ; i++) {
			xTotal3 *= xString3.charAt(i)-64;
			
		}
	//	System.out.println(xTotal3);
		int xMod3 = xTotal3%47;
	//	System.out.println(xMod3);
		
		int xTotal4 = 1;
		for (int i = 0; i < 6 ; i++) {
			xTotal4 *= xString4.charAt(i)-64;
			
		}
	//	System.out.println(xTotal4);
		int xMod4 = xTotal4%47;
	//	System.out.println(xMod4);
		
		
		if (xMod1 == xMod2) {
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}
		
		if (xMod3 == xMod4) {
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}
		
		
	}

}
