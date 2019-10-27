package xTEEN;

import java.util.Scanner;
import java.util.Arrays;

public class xCurso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int xAmount = scan.nextInt();
		int[] xArray = new int[xAmount*2];
		
		for (int i = 0; i<xAmount*2; i++) {
			xArray[i] = scan.nextInt();
		}
	//	System.out.println(Arrays.toString(xArray));
		
		boolean xCheck = false;
		
		int A = xArray[0]; //1
		int B = xArray[1]; //1
		int C = xArray[2]; //4
		int D = xArray[3];  //4
		
		if (xAmount <= 2 ) {
				if (A > C || B > C || A > D || B > D) {
					xCheck = true;
				} else {
					xCheck = false;
				}	
			
		}
		else if (xAmount >= 3) {
		
	
		for (int i = 0; i<xAmount; i = i + 2) {
			if (xArray[i] > xArray[i+2] || xArray[i] > xArray[i+3] || xArray[i+1] > xArray[i+2] || xArray[i+1] > xArray[i+3]) {
				xCheck = true;
			} else {
				xCheck = false;
			}
		}
		
		
		}
		
		if (xCheck == true) {
			System.out.println("SI");
		} else if (xCheck == false) {
			System.out.println("NO");
		}
	}
		
}
