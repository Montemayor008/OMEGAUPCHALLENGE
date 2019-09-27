package xTEEN;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xArraySize = scan.nextInt();
		int [] xArray = {xArraySize};
		
		for (int index = 0; index < xArraySize ; index++) {
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
		}

	}

}
