package xBasicProgramming;

import java.util.Scanner;

public class xAplusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input is "Integer 1" and "Integer 2" to sum
		// Output is the sum of the integers
		
		Scanner scan = new Scanner (System.in); 
		int xInput = scan.nextInt();     //Scans first input
		int xInputTwo = scan.nextInt();  //Scans second input
		System.out.print(xInput + xInputTwo);  // Adds inputs and prints result
	
	}

}