package xTEENCONTEST;

import java.util.Scanner;
import java.util.Arrays;

public class xCont5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		long Toro = scan.nextInt();
		long Hombres = scan.nextInt();
		
//		for (int i = 0; i < Hombres; i++) {
//			int hombreNuevo = scan.nextInt();
//			Toro = Toro - hombreNuevo;
//			if (Toro <= 0) {
//				System.out.println(i+1);
//				break;
//			}
//			
//		}
//		if (Toro > 0) {
//			System.out.println("0");
//		}
		long suma =0;
		for (int i = 0; i < Hombres; i++) {
			long hombreNuevo = scan.nextInt();
			suma = suma + hombreNuevo;
			if (suma > Toro) {
				System.out.println(i+1);
				break;
			}
			
		}
		if (suma < Toro) {
			System.out.println("0");
		}

	}

}
