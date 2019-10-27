package xTEEN;

import java.util.Arrays;
import java.util.Scanner;

public class xCurso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//System.out.println(Arrays.toString(XARRAYNAME));
		
		//String xName = scan.next();
		
		//char[] xCharName = xString.toCharArray();
		
		int xCamiones = scan.nextInt();
		int xPreguntas = scan.nextInt();
		
		int[] xCamionesArray = new int[xCamiones];
		
		for (int i = 0; i < xCamiones; i++) {
			xCamionesArray[i]= i+1;
		}
		//System.out.println(Arrays.toString(xCamionesArray));
		
		int[] xCantidades = new int[xCamiones];
		
		for (int i = 0; i< xCamiones; i++) {
			xCantidades[i] = scan.nextInt();
		}
		//System.out.println(Arrays.toString(xCantidades));
		
		
		int[] xPreguntasArray = new int[xPreguntas];
		
		for (int i = 0; i < xPreguntas; i++) {
			xPreguntasArray[i] = scan.nextInt();
		}
		
		//System.out.println(Arrays.toString(xPreguntasArray));
		
		for (int i = 0 ; i < xPreguntas; i++) {
			for (int j = 0; j < xCamiones; j++) {
				if (xPreguntasArray[i] == xCamionesArray[j]) {
					System.out.println(xCantidades[j]);
				}
			}
		}
		

	}

}
