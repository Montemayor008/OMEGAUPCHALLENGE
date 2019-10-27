package xTEEN;

import java.util.Scanner;

public class xChallenge19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int xPreguntas = scan.nextInt();
		int xPaqChico = scan.nextInt();
		int xPaqGrande = scan.nextInt();
		
		for (int i = 0; i < xPreguntas ; i++) {
			int pregunta = scan.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			while (sum1 < (pregunta)) {
				sum1 += xPaqChico;
			}
			sum3=sum1;
			
			while(sum3 != pregunta && sum1 > 0 ) {
				if( sum3 > pregunta ) {
					sum1 -= xPaqChico;
				} else {
					sum2 += xPaqGrande;
				}
				sum3 = sum1 + sum2;
			}

			if (sum3 == pregunta) {
				System.out.println("Si");
			} else {
				System.out.println("No");
			}
		}
		
		
	
		
	}

}
