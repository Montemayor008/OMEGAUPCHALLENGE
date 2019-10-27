package xTEEN;

import java.util.Scanner;
import java.util.Arrays;

public class xChallenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int xArraySize = scan.nextInt();
				int[] xArray = new int[xArraySize];
				int[] xSimpleArray = new int[xArraySize];
				int[] xReceiver = new int[xArraySize];
				
				for (int i = 0; i  < xArraySize; i++) {
					xArray[i] = i+1;
				}
				
				int[] xFiboArray = new int[xArraySize];
				for (int i = 0; i < xArraySize-2; i++) {
					xFiboArray = xArray;
					xFiboArray[i+2] = xFiboArray[i]+xFiboArray[i+1];
					//Fibonacci
				}
				
				for (int i = 0; i < xArraySize ; i++) {
					xSimpleArray[i] = i+1;
				}
				
				for (int i = 0; i < xArraySize; i++) {
			//		System.out.println(xSimpleArray[i]);
			//		System.out.println(xFiboArray[i]);
					for (int j = 0; j < xArraySize ; j++) {
						if (xSimpleArray[i] == xFiboArray[j] || xSimpleArray[i] == xArraySize) {
							xSimpleArray[i] = 300;	
						//	xSimpleArray = ArrayUtils.remove(xSimpleArray, i);
						//	System.out.println("Se repite el");
							//System.out.println(xSimpleArray[i]);
						}
					}
				}
				
				for (int i = 0; i < xArraySize; i++) {
					if (xSimpleArray[i] != 300) {
						System.out.print(xSimpleArray[i]+ " ");
					}
				}
				
				
			//	System.out.println(Arrays.toString(xArray));
			//	System.out.println(Arrays.toString(xFiboArray));
			//	System.out.println(Arrays.toString(xSimpleArray));
		
				
			}

			
			
			
			

		}