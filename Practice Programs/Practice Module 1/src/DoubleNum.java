import java.util.Scanner;

public class DoubleNum {
	public static void main(String[] args) {
		
		/*
		 * Create program that doubles number
		 * Initialize ints and scanner
		 * 
		 * Prompt user for number
		 * Print out doubled number
		 */
		Scanner scnr = new Scanner(System.in);
		int x;
		
		System.out.print("Enter whole number: ");
		x = scnr.nextInt();
		
		System.out.println("Your number doubled is: " + (2 * x));
		System.out.println("Your number doubled is: " + (x + x));
		System.out.printf("Your number doubled is: %d \n", x * 2);
		
		
	}
}
