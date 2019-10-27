package xTEEN;

import java.util.Scanner;
import java.util.Arrays;

public class xSemana2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int arraysLength = scan.nextInt();
		int[] arrayA = new int[arraysLength];
		int[] arrayB = new int[arraysLength];
		boolean checkIf = true;
		int yesAmount = 0;
		
		for (int i = 0; i < arraysLength; i++) {
			arrayA[i] = scan.nextInt();
		}
		
	//	System.out.println(Arrays.toString(arrayA));
		
		for (int i = 0; i < arraysLength; i++) {
			arrayB[i] = scan.nextInt();
		}
		
	//	System.out.println(Arrays.toString(arrayB));
		
		for (int i = 0; i < arraysLength; i++) {
			for (int j = 0; j  < arraysLength; j++) {
				if (arrayA[i] == arrayB[j]) {
					checkIf = true;
					yesAmount += 1;
		//			System.out.println(yesAmount);
					break;
				} else if (arrayA[i] != arrayB[j]) {
					checkIf = false;
		//			System.out.println("checkednel");
				}
			}
		}
		
		if (yesAmount == arraysLength) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
