package xTEEN;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xSizeGiven  = scan.nextInt();
		String xPassword = scan.next();
	//	char[] xCharsArray = xPassword.toCharArray();
		
		for (int i =0; i < xSizeGiven; i++) {
		char xCharChecked = xPassword.charAt(i);

		
		 // System.out.println(xCharChecked);
		if (xCharChecked == 'a' || xCharChecked == 'e' || xCharChecked == 'i' || xCharChecked == 'o' || xCharChecked == 'u' || xCharChecked == 'A' || xCharChecked == 'E' || xCharChecked == 'I' || xCharChecked == 'O' || xCharChecked == 'U' ) {
			System.out.println("es AEIOU");
		} else {
			System.out.println("INSEGURO");
		}
		}
		

	}

}
