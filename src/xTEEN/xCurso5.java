package xTEEN;

import java.util.Scanner;

public class xCurso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xSize = scan.nextInt();
		int[] xArray = new int[xSize];
		
		for (int i = 0; i<xSize; i++) {
			xArray[i] = scan.nextInt();
		}
		
		int xCounter = 0;
		
		int check = 0;
		
		for (int i = 0; i<xSize-1; i++) {
			if (xArray[i] >= xArray[i+1]) {
				xCounter++;
			}
			
			if (xCounter == xSize-1) {
				System.out.println("DECRECIENTE");
				check = 1;
			}
		}
		
		int xCounter2 = 0;

		for (int i = 0; i<xSize-1; i++) {
			if (xArray[i] <= xArray[i+1]) {
				xCounter2++;
			}
			
			if (xCounter2 == xSize-1) {
				System.out.println("CRECIENTE");
				check = 1;
			}
		} 
		
		
		if (check == 0) {
			System.out.println("NO ORDENADA");
		}
		
		
		
	
		

	}

}
