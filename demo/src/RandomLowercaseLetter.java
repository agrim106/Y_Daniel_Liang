import java.util.Random;

public class RandomLowercaseLetter {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate a random number between 0 and 25 (inclusive)
        int randomNumber = rand.nextInt(26);

        // Convert the random number to a lowercase letter
        char randomLetter = (char) ('a' + randomNumber);

        System.out.println("Random lowercase letter: " + randomLetter);
    }
}
