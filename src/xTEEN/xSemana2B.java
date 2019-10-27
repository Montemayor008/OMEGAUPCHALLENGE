package xTEEN;

import java.util.Scanner;
import java.util.Arrays;

public class xSemana2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		String[] numeroRomano = new String[15];
		
		for (int i = 0; i < 10 ; i++) {
			if (numero % 100 == 0) {
				numeroRomano[i] = "C";
				break;
			}
			if (numero >= 90) {
				numeroRomano[i] = "XC";
				numero = numero -90;
			}
			
			if (numero >= 50 ) {
				numeroRomano[i] = "L";
				numero = numero - 50;
			}
			if (numero >= 40 ) {
				numeroRomano[i] = "XL";
				numero = numero - 40;
			}
			for (int j = i ; j < i+3 ; j++) {
				if (numero >= 10) {
					numeroRomano[j+1] = "X";
					numero = numero-10;
				}			
			}
			if (numero >= 9) {
				numeroRomano[i+4] = "IX";
				numero = numero - 9;
			}
			
			for (int k = i; k < i+3 ; k++) {
				if (numero >= 5) {
					numeroRomano[i+6] = "V";
					numero = numero-5;
				//	System.out.println(numero);
				}
			}
			
			if (numero >= 4) {
				numeroRomano[i+4] = "IV";
				numero = numero - 4;
			//	System.out.println(numero);
			}
			for (int l = i; l < i+3 ; l++) {
				if (numero >= 1) {
					numeroRomano[l+9] = "I";
					numero = numero-1;
				//	System.out.println(numero);
				}
			}
			
			break;
		}
		for (int i = 0; i < 15; i++) {
			if (numeroRomano[i] != null) {
				System.out.print(numeroRomano[i]);
			}
		}
		System.out.println(Arrays.toString(numeroRomano));
		

	}

}
