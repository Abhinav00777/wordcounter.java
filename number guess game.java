import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int secretNumber = (int) (Math.random() * 100) + 1; // generate a random number between 1 and 100
            int guessCount = 0;
            int guessLimit = 5;

            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have " + guessLimit + " guesses to guess the number.");

            while (guessCount < guessLimit) {
                System.out.print("Guess the number: ");
                int guess = input.nextInt();

                guessCount++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations, you guessed the number in " + guessCount + " guesses.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. You have " + (guessLimit - guessCount) + " guesses left.");
                } else {
                    System.out.println("Too high. You have " + (guessLimit - guessCount) + " guesses left.");
                }
            }

            if (guessCount == guessLimit) {
                System.out.println("Sorry, you ran out of guesses. The number was " + secretNumber + ".");
            }
        }
    }
}
