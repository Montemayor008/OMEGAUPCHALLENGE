package xTEEN;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int xFirst = scan.nextInt();
		int xAvg = scan.nextInt();
		int xGrade = 0;
		
		xGrade = (xAvg*2) - xFirst;
		System.out.println(xGrade);
		
		
		

	}

}
