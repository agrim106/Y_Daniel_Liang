import java.util.*;

public class ThreeDigitLotteryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottery = (int)(Math.random() * 1000);
        System.out.println("Enter a three-digit number:");
        int guess = sc.nextInt();

        // Extracting the lottery digits correctly
        int lotteryDigit1 = lottery % 10; // Last digit
        int lotteryDigit2 = (lottery / 10) % 10; // Middle digit
        int lotteryDigit3 = lottery / 100; // First digit

        // Extracting the guess digits correctly
        int guessDigit1 = guess % 10; // Last digit
        int guessDigit2 = (guess / 10) % 10; // Middle digit
        int guessDigit3 = guess / 100; // First digit

        System.out.println("The lottery number is: " + lottery);

        // Check for exact match
        if (guess == lottery) {
            System.out.println("Exact Match: You win $12,000");
        }
        // Check for all digits match, but not in order
        else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) &&
                (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) &&
                (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3) &&
                (guessDigit1 != guessDigit2 || guessDigit1 != guessDigit3 || guessDigit2 != guessDigit3)) {
            System.out.println("Congrats, all three numbers match (just not in the correct order): You win $5,000");
        }
        // Check if two digits match in any order
        else if ((lotteryDigit1 == guessDigit1 && (lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)) ||
                (lotteryDigit2 == guessDigit1 && (lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)) ||
                (lotteryDigit3 == guessDigit1 && (lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3))) {
            System.out.println("Two digits match: You win $3,000");
        }
        // Check if at least one digit matches
        else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3 ||
                lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3 ||
                lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3) {
            System.out.println("You matched one of the numbers: You won $2,000");
        }
        else {
            System.out.println("No match: Try again!");
        }
    }
}
