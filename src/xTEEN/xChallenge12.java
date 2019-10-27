package xTEEN;

import java.util.Scanner;

public class xChallenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String xStringA = scan.next() + "111111";
		char[] xCharA = xStringA.toCharArray();
		String[] xAlpha = new String[26];
		xAlpha[0]="a";
		xAlpha[1]="B";
		xAlpha[2]="C";
		xAlpha[3]="D";
		xAlpha[4]="E";
		xAlpha[5]="F";
		xAlpha[6]="G";
		xAlpha[7]="H";
		xAlpha[8]="I";
		xAlpha[9]="J";
		xAlpha[10]="K";
		xAlpha[11]="L";
		xAlpha[12]="M";
		xAlpha[13]="N";
		xAlpha[14]="O";
		xAlpha[15]="P";
		xAlpha[16]="Q";
		xAlpha[17]="R";
		xAlpha[18]="S";
		xAlpha[19]="T";
		xAlpha[20]="U";
		xAlpha[21]="V";
		xAlpha[22]="W";
		xAlpha[23]="X";
		xAlpha[24]="Y";
		xAlpha[25]="Z";
		
		
		char one = xStringA.charAt(0);
		char two = xStringA.charAt(1);
		char three = xStringA.charAt(2);
		char four = xStringA.charAt(3);
		char five = xStringA.charAt(4);
		char six = xStringA.charAt(5);

		String sOne = Character.toString(one);
		String sTwo = Character.toString(two);
		String sThree = Character.toString(three);
		String sFour = Character.toString(four);
		String sFive = Character.toString(five);
		String sSix = Character.toString(six);
	/*	
		System.out.println(sOne);
		System.out.println(sTwo);
		System.out.println(sThree);
		System.out.println(sFour);
		System.out.println(sFive);
		System.out.println(sSix);
	*/
		
		for (int i = 0; i < 26 ; i++) {
			if (sOne != xAlpha[i]) {
				int oneVar = 1;
				oneVar = i+1;
				System.out.println("Value is");
				System.out.println(sOne + " " +xAlpha[i]);
				System.out.println(oneVar);
			} else {
				System.out.println("no value was similar1");
			}
			
			if (sTwo != xAlpha[i]) {
				int twoVar = 2;
				twoVar = i+1;
				System.out.println("Value is");
				System.out.println(sTwo + " " +xAlpha[i]);
				System.out.println(twoVar);
			} else {
				System.out.println("no value was similar2");
			}
			}
		}
		
		
		
	}


