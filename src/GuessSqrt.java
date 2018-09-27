import java.util.Scanner;

public class GuessSqrt {
	// we declare our variables
	private static long lastGuess = 0l;
	private static long nextGuess = 0l;
	private static long input = 0l;
	private static boolean continueLoop = true;
	// we will user scanner to take input
	private static Scanner sc = new Scanner(System.in);

	public static double sqrt(long n) {
		lastGuess = 1l;
		do {
			nextGuess = ((lastGuess + n / lastGuess) / 2);
			System.out.printf("\nHello\n");
			if ((nextGuess - lastGuess) > 0.0001) {
				lastGuess = nextGuess;
			} else
				continueLoop = false;
		} while (continueLoop == true);

		return nextGuess;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Hello I am a babylonian square root estimator.\n"
				+ "Enter the number you want to find the square root of");
		input = sc.nextLong();

		System.out.printf("The estimated square root is: %f", sqrt(input));
	}

}
