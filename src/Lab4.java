import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		
		String userInput;
		do {
			System.out.println("Please enter an integer:");
			int userInt = scnr.nextInt();
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-10s %-10s %-10s\n", i, (int) Math.pow(i, 2), (int)Math.pow(i, 3));
			}
				System.out.println("Would you like to continue? (y/n)");
				userInput = scnr.next();		
			} while (userInput.equals("y"));

		System.out.println("Goodbye.");

	}
}
