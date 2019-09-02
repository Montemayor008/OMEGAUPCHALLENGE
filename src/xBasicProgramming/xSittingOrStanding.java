package xBasicProgramming;
import java.util.Scanner;
public class xSittingOrStanding {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input is "Amount of Lines" "Amount of Rows" and "Total Tickets Sold"
		// Output is "Amount of sitting people" and "Amount of standing people"
		
		
		int xLines = scan.nextInt(); // Amount of Seat Lines
		int xRows = scan.nextInt(); // Amount of Row Lines
		int xTotalSeats = (xLines * xRows); // Multiplication to get Total Amount of Seats
		int xTotalTickets = scan.nextInt(); // Total of sold Tickets
		int xSubstraction = (xTotalTickets - xTotalSeats); // Subtraction of TotalTickets and Total of Seats
		
		// In the following expressions the amount of seated persons is calculated
		
	if (xTotalTickets < xTotalSeats) {	
		System.out.println(xTotalTickets);   // If amount of seats is bigger than sold tickets, print amount of tickets
	} else {
		System.out.println(xTotalSeats); // If amount of tickets is bigger than amount of seats, print amount of seats
	}
	
	   // In the following expressions the amount of standing people is calculated
	
	if (xSubstraction < 0 ) {
		System.out.println("0"); //Print 0 due to non negative valid answers
	} else if ((xTotalTickets < xTotalSeats)) {  
		System.out.println(xTotalTickets); //The amount of TotalTickets will be printed if there are more seats than people
	} else {
		System.out.println(xSubstraction); //The amount of standing people is the substraction of TotalTickets and Seats
	}
	
	}
}
