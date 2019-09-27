package xTEEN;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xSizeGiven  = scan.nextInt();
		String xPassword = scan.next();
		xPassword.toLowerCase();
		
		boolean xSeguro = true;
		boolean xSeguroVocales = false;
		boolean xSeguroNumeros = false;
		boolean xSeguroRepetidos = true;
		
		for (int j = 0; j < xPassword.length(); j++) {
		
			char xCharCheck = xPassword.charAt(j);  
		
			if (xCharCheck == 'a' || xCharCheck == 'e' || xCharCheck == 'i' || xCharCheck == 'o' || xCharCheck == 'u' || xCharCheck == 'A' || xCharCheck == 'E' || xCharCheck == 'I' || xCharCheck == 'O' || xCharCheck == 'U') {
				xSeguroVocales = true; 
				//	System.out.println("INSEGURO");
			}
			
			if (xCharCheck == '0' || xCharCheck == '1' || xCharCheck == '2' || xCharCheck == '3' || xCharCheck == '4' || xCharCheck == '5' || xCharCheck == '6' ||  xCharCheck == '7' ||  xCharCheck == '8' ||  xCharCheck == '9') {
				xSeguroNumeros = true;
				//	System.out.println("INSEGURO");
			}
			
			for (int i = j+1; i < xPassword.length(); i++) {
				char xCharDos = xPassword.charAt(j+1);
				if (xCharCheck == xCharDos) {
					xSeguroRepetidos = false;
					System.out.println(xCharDos);
					System.out.println(xCharCheck);
	
					break;
				}
			} 
			
			if (xSeguroRepetidos == false) {
				break;
			}
			
			
		}
		if (xPassword.length() < 12) {
			xSeguro = false;
		}
		
		if (xSeguro == true && xSeguroVocales == true && xSeguroNumeros == true && xSeguroRepetidos == true) {
			System.out.println("SEGURO"); 
		} else {
			System.out.println("INSEGURO");
		}
		// if true o false print ""
		
		

	}

}
