import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Read the user's input

        // Store the original number for comparison later
        int originalNum = num;
        int reverseNum = 0; // Variable to hold the reversed number

        // Reverse the number by extracting and appending digits
        while (num != 0) {
            int digit = num % 10; // Extract the last digit of the number
            reverseNum = reverseNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        // Check if the original number is the same as the reversed number
        if (originalNum == reverseNum) {
            System.out.println(originalNum + " is a palindrome."); // It's a palindrome!
        } else {
            System.out.println(originalNum + " is not a palindrome."); // It's not a palindrome
        }
    }
}
