import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		/*
		 * prompt for input
		 * get numbers from user and store in x and y
		 * 
		 * store x + y in z
		 * print z
		 * 
		 * store x * y in w
		 * print w
		 * 
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = in.nextInt();
		
		System.out.print("Enter the first number: ");
		int n2 = in.nextInt();
		
		int ans = n1 + n2;
		System.out.printf("%d + %d = %d\n", n1, n2, ans);
		
		ans = n1 * n2;
		System.out.printf("%d + %d + %d\n", n1, n2, ans);
		
		ans = n1 / n2;
		System.out.printf("%d + %d + %d\n", n1, n2, ans);
		
	}
}
