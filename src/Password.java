import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a password that is 8 characters long and includes an underscore");
		String password = scnr.next();
		
		//calculate length of password and set it to no less than 8 
		
		int passwordLength = password.length();
		
		if (passwordLength >= 8 && password.contains("_")) {
			System.out.println("You're in the club.");
		}
		else {
			System.out.println("Sorry");
		}
	}
}
