package xBasicProgramming;
import java.util.Scanner;
public class xMixedFractions {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input is an improper fraction made up by "Nominator" and "Denominator"
		// Output is a Mixed Fraction
		int xNominator = scan.nextInt(); //Input of Nominator
		int xDenominator = scan.nextInt(); //Input of Denominator
	if (xNominator % xDenominator ==0) { //if to print out exact answers
		System.out.println(xNominator/xDenominator); //print of exact answer
	} else {
		System.out.println(xNominator/xDenominator +" "+ xNominator%xDenominator + "/" + xDenominator); //Concatenation of whole number, and remainder over denominator
	}
		
	}

}
