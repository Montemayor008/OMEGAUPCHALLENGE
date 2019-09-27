package xTEEN;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xMin = 1;
		int xTotalN = scan.nextInt();
		
		while (xMin <= xTotalN) {
			int xYears = scan.nextInt();
			
			if ((xYears % 4 == 0)) {
				if (xYears % 100 == 0) {
					if (xYears % 400 == 0 ) {
						System.out.println("S");
					} else {
						System.out.println("N");
					}
				} else {
				System.out.println("S");
			}  
			
			} else {
				System.out.println("N");
			}
			
			
		/*	
			System.out.println("on round" + (xMin) + " Year is " + (xYears));
			xMin++;
		*/	
		}
		
	/*	
		while (xMin < xTotalN) {
			int xYears = scan.nextInt();
		
			System.out.println("Ronda " +(xMin));
			xMin++;
			System.out.println(xYears);
			
			xYears = scan.nextInt();
		}
	*/	

	}

}
