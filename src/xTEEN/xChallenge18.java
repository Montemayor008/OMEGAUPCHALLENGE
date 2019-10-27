package xTEEN;

import java.util.Arrays;
import java.util.Scanner;

public class xChallenge18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xArraySize = scan.nextInt();
		int[] xArray = new int[xArraySize];
		int[] xFiboArray = new int[xArraySize];
		int[] xNewArray = new int[xArraySize];
		
		for (int i = 0; i  < xArraySize; i++) {
			xArray[i] = i+1;
		}
	
		int sum;
		int x = 0;
		int y = 1;
		for (int i = 0; i < xArraySize; i++) {
			sum = x + y;
			x = y; 
			y = sum;
			xFiboArray[i] = x;
		}
		
		for (int i = 0; i < xArraySize; i++) {
			for (int j = 0; j < xArraySize; j++) {
				if (xArray[j] == xFiboArray[i]) {
					xArray[j] = 0;
				}
				if (xArray[j] == xArraySize) {
					xArray[j] = 0;
				}
			}
		}
		
		for (int i = 0; i < xArraySize; i++) {
			if (xArray[i] != 0) {
				System.out.print(xArray[i] + " ");
			}
		}
		
		
	//	System.out.println(Arrays.toString(xArray));
	//	System.out.println(Arrays.toString(xFiboArray));
	//	System.out.println(Arrays.toString(xNewArray));
	}

}
