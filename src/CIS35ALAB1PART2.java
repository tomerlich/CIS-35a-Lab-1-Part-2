import java.util.Scanner;

public class CIS35ALAB1PART2 {
	// we declare our variables
	private static double lastGuess = 0;
	private static double nextGuess = 0;
	private static long input = 0l;
	private static boolean continueLoop = true;
	private static boolean inputValid = false;
	// we will user scanner to take input
	private static Scanner sc = new Scanner(System.in);

	public static double sqrt(long n) {
		// Used as a baseline value for the Babylonian estimation
		lastGuess = 1l;

		// this loop defines the next guess based on the last guess and the entered
		// number.
		// it will continue to run until the if statement tests false and triggers the
		// else statement
		do {
			nextGuess = ((lastGuess + (n / lastGuess)) / 2);
			System.out.printf("What the square root might be: %-30fWhat I thought it was: %f\n", nextGuess, lastGuess);
			// we use abs absolute value so that the difference does not come out negative
			// ending the loop too soon
			if (abs(lastGuess - nextGuess) > 0.000000000001) {
				lastGuess = nextGuess;
			} else {
				continueLoop = false;
				System.out.printf("I think I found the square root!\n");
			}
		} while (continueLoop == true);

		return nextGuess;
	}

	public static double abs(double num1) {
		if (num1 < 0)
			num1 *= -1;
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Hello I am a babylonian square root estimator.\n"
				+ "Enter the number you want to find the square root of: ");
		do {
			input = sc.nextLong();
			if (input < 0)
				System.out.printf("This is not a valid entry please try again: ");
			else
				inputValid = true;
		} while (inputValid == false);

		System.out.printf("The estimated square root is: %f", sqrt(input));
	}

}
