package xTEENCONTEST;

import java.util.Scanner;
import java.util.Arrays;


public class xCont2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		char xString = scan.next().charAt(0);
		int ascii = (int) xString;
		
	//	System.out.println(ascii);
		
		if (ascii >= 65 && ascii <=90 ) {
			System.out.println("MAYUSCULA");
		}
		else if (ascii >= 97 && ascii <=122 ) {
			System.out.println("MINUSCULA");
		}
		else {
			System.out.println("OTRO");
			
		}

	}

}
