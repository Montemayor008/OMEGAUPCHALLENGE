package xTEENCONTEST;


import java.util.Scanner;
import java.util.Arrays;


public class xCont6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		int x4 = scan.nextInt();
		int y4 = scan.nextInt();
		
		
		
		
		int[] x1Array = new int [java.lang.Math.abs(x2-x1)+1];
		int[] x2Array = new int [java.lang.Math.abs(x4-x3)+1];
		int[] y1Array = new int [java.lang.Math.abs(y2-y1)+1];
		int[] y2Array = new int [java.lang.Math.abs(y4-y3)+1];
		
		for (int i = 0; i < x1Array.length; i++) {
			if (x2<x1) {
				x1Array[i] = x2+i;
			} else {
				x1Array[i] = x1+i;
			}
		}
		
		for (int i = 0; i < x2Array.length; i++) {
			if (x4<x3) {
				x1Array[i] = x4+i;
			} else {
				x1Array[i] = x3+i;
			}
		}
		
		
		
	
		System.out.println(Arrays.toString(x1Array));
		System.out.println(Arrays.toString(x2Array));
		
		
	}

}
