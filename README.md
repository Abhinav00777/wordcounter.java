# wordcounter.java
word counter in java
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get the input sentence from the user.
            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            // Split the sentence into words.
            String[] words = sentence.split(" ");

            // Count the number of words in the sentence.
            int wordCount = words.length;

            // Print the number of words in the sentence.
            System.out.println("The sentence contains " + wordCount + " words.");
        }
    }
}
