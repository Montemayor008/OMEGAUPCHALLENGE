package xTEENCONTEST;

import java.util.Scanner;
import java.util.Arrays;

public class xCont4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String xUno = scan.next();
		String xDos = scan.next();
		char[] xCharUno = xUno.toCharArray();
		 String xNewUno = "";
		
		 for (int i = xUno.length()-1;i>=0;i--) {
			xNewUno = xNewUno + xUno.charAt(i);
		 }
		 
	
		
		
		 if (xNewUno.equals("" + xDos)) {
			 System.out.println("Rotacion");
		 } else {
			 System.out.println("No rotacion");
		 }

	}

}
