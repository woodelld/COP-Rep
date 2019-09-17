import java.util.Scanner;
public class ZillowLab {
	public static void main(String[] args) {
		
		/*
		 * Create program that take current price and last months price. 
		 * Outputs summary that lists price, change sing last month, 
		 * and estimated mortgage computed as (currentPrice * .045)/12.
		 * 
		 * Initialize scanner and ints
		 * prompt user for inputs
		 * output summary
		 */
		Scanner scnr = new Scanner(System.in);
		int currentPrice;
		int lastMonthsPrice;
		
		System.out.print("Enter current price here: ");
		currentPrice = scnr.nextInt();
		System.out.print("Enter last month's price here:");
		lastMonthsPrice = scnr.nextInt();
		
		System.out.println("This house is $" + currentPrice + ". The change is $"
						 + (currentPrice - lastMonthsPrice) + 
						 " since last month.\nThe estimated monthly mortgage is $" + 
						 ((currentPrice * 0.045) / 12) + ".");
	}

}
