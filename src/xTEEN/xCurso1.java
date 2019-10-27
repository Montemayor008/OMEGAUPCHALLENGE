package xTEEN;


import java.util.Scanner;
import java.util.Arrays;

public class xCurso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	//	System.out.println(Arrays.toString(XARRAYNAME));
		int xLength = scan.nextInt();
		int xArrayLength = xLength*2;
		String[] xStringArray = new String[xArrayLength];
		
		for (int i = 0; i < xArrayLength; i++) {
			xStringArray[i] = scan.next();
		}
		
	//	System.out.println(Arrays.toString(xStringArray));
		
		String xNombreRequested = scan.next();
		
	//	System.out.println(xNombreRequested);
		
		for (int i = 0; i < xArrayLength; i++) {
			if (xNombreRequested.contentEquals(xStringArray[i])) {
				System.out.println(xStringArray[i+1]);
			}
		}

	}

}
