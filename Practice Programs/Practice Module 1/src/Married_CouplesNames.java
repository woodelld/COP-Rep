import java.util.Scanner;

public class Married_CouplesNames {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstName1;
		String lastName1;
		String firstName2;
		String lastName2;
		
		System.out.println("What is the first person's first name?");
		System.out.print("Enter here:");
		firstName1 = scnr.nextLine();
		System.out.println("What is the first person's last name?");
		System.out.print("Enter here:");
		lastName1 = scnr.nextLine();
		
		System.out.println("What is the second person's first name?");
		System.out.print("Enter here:");
		firstName2 = scnr.nextLine();
		System.out.println("What is the second person's last name?");
		System.out.print("Enter here:");
		lastName2 = scnr.nextLine();
		
		System.out.println("Here are some common married-couple names:");
		System.out.println(firstName1 + " " + lastName1 + " and " + 
						   firstName2 + " " + lastName2);
		System.out.println(firstName1 + " and " + firstName2 + " " + lastName1);
		System.out.println(firstName1 + " and " + firstName2 + " " + lastName2);
		//FIXME: Print two hyphenated last name options, with either last name
		//appearing first. (A hyphen can be written as "-")
		System.out.println(firstName1 + " and " + firstName2 + " " + lastName1 +
						   "-" + lastName2);
		System.out.println(firstName1 + " and " + firstName2 + " " + lastName2 +
					       "-" + lastName1);
		
		
	}
	
}
