package xTEEN;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xA = scan.nextInt();
		int xB = scan.nextInt();
		int xC = scan.nextInt();
		
		if (xA == 90 || xB == 90 || xC == 90) {
			System.out.println("RECTANGULO");
		} else if (xA == xB && xB == xC) {
			System.out.println("EQUILATERO");
		} else if (xA == xB || xB == xC || xA == xC) {
			System.out.println("ISOSCELES");
		} else if (xA != xB && xB != xC) {
			System.out.println("ESCALENO");
		}

	}

}
