package xTEEN;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;


public class xCurso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int xAmount = scan.nextInt();
		
		double[] xArray = new double[xAmount];
				
		for (int i = 0 ; i <xAmount; i++) {
			xArray[i] = scan.nextInt();
		}

	//x	System.out.println(Arrays.toString(xArray));
		
		double g = 3;
		for (int i = 0 ; i <xAmount; i++) {
			double h = xArray[i];
			xArray[i] = (double) (((Math.sqrt(g))*h)/2);
			System.out.println(String.format("%.2f",xArray[i]));
		}

	}

}
