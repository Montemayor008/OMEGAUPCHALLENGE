package xTEENCONTEST;

import java.util.Scanner;
import java.util.Arrays;

public class xCont1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String xString = scan.nextLine();
	//	char[] xStringArray = xString.toCharArray();
		
		char[] xStringArray = xString.toCharArray();
		for (int i = 0; i < xStringArray.length;i++) {
			if (xStringArray[i] == 'b') {
				xStringArray[i] = 'd';
			}
			else if (xStringArray[i] == 'd') {
				xStringArray[i] = 'b';
			}
			else if (xStringArray[i] == 'D') {
				xStringArray[i] = 'B';
			}
			else if (xStringArray[i] == 'B') {
				xStringArray[i] = 'D';
			}
		}
 
		//System.out.println(xString);
		for (int i = 0; i < xStringArray.length;i++) {
			System.out.print(xStringArray[i] + "");
			
		}
		

	}

}
