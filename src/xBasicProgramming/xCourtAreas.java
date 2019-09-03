package xBasicProgramming;
import java.util.Scanner;
public class xCourtAreas {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input coordinates x1,y1 and x2,y2 of two squares or courts
		// Output area covered by the two squares, or courts
		
		int xX1 = scan.nextInt();
		int xY1 = scan.nextInt();
		int xX2 = scan.nextInt();
		int xY2 = scan.nextInt();
		int xDeltaX1 = xX2 - xX1;
		int xDeltaY1 = xY2 - xY1;
		int xAreaXY1 = xDeltaX1 * xDeltaY1; //Area calculations of the first square
	 // System.out.println(xAreaXY1);
		
		int xXX1 = scan.nextInt();
		int xYY1 = scan.nextInt();
		int xXX2 = scan.nextInt();
		int xYY2 = scan.nextInt();
		int xDeltaXX1 = xXX2 - xXX1;
		int xDeltaYY1 = xYY2 - xYY1;
		int xAreaXY2 = xDeltaXX1 * xDeltaYY1; //Area calculations of the second square
	//	System.out.println(xAreaXY2);
		
		int xOverlappedAreasX = (xX2 - xXX1); 
		int xOverlappedAreasY = (xY2 - xYY1);
		int xAreaOverlapped = xOverlappedAreasX * xOverlappedAreasY; //Area calculations of the overlapped square
		
		int xAreasCalculation = ((xAreaXY1 + (xAreaXY2 - xAreaOverlapped)));
		System.out.println(xAreasCalculation);
		
		
	}

}
