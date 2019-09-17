import java.util.Scanner;

public class numSquared {
	public static void main(String[] args) {
		/*
		 * Purpose of program is to get an integer from input and 
		 * output the integer squared ending with newline. 	
		 * 
		 * initialize scanner and int 
		 * prompt user for int
		 * square int and output		 
		 */
		
		Scanner scnr = new Scanner(System.in);
		int numOne;
		int numTwo;
		
		System.out.print("Enter your number here:");
		numOne = scnr.nextInt();
		
		//Method One
		System.out.printf("Your number squared is %d \n", numOne * numOne);
		
		//Method Two
		numTwo = numOne * numOne;
		System.out.println("Your number squared is " + numTwo);
		
		//Method Three
		System.out.println("Your number squared is " + (numOne * numOne));
	}
}
