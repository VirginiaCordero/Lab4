import java.util.Scanner;

public class Capitalizer {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter one word.");
		String word = scnr.next();
		
		// capitalize the first letter
		String firstLetter = word.substring(0, 1);
		firstLetter = firstLetter.toUpperCase();
		
		System.out.println(firstLetter);
		
		// grab the rest of the word and lower case it
		String otherLetters = word.substring(1);
		otherLetters = otherLetters.toLowerCase();
		System.out.println(otherLetters);
		
		//combine the first and the rest
		String capitalizedWord = firstLetter + otherLetters;
		System.out.println(capitalizedWord);

		scnr.close();
	}

}
