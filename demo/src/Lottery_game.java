//Writing a program, That generates a lottery number and the user has to guess it to win an amount.

import java.util.*;

public class Lottery_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generating lottery digits.
        int lottery = (int)(Math.random() * 100);

        //Taking User Input.
        System.out.println("Enter any two digit number.");
        int guess = sc.nextInt();

        //Separating the lottery digits.
        int lotterydigit1 = lottery / 10;
        int lotterydigit2 = lottery % 10;

        //Now separating the guessDigits.
        int guessDigit1 = guess / 10 ;
        int guessDigit2 = guess % 10 ;

        System.out.println("The lottery is : " + lottery);
        //Now writing If-else Statements.
        if(guess == lottery){
            System.out.println("Exact Match: Congrats, You have won $10000");
        }else if(guessDigit1 == lotterydigit2 && guessDigit2 == lotterydigit1){
            System.out.println("Congrats, You have guessed the numbers , although in a different order, You win $3000");
        }else if(guessDigit1==lotterydigit1 || guessDigit1 == lotterydigit2 || guessDigit2 == lotterydigit1 || guessDigit2 == lotterydigit2){
            System.out.println("You have matched one of the numbers. You win $ 1000");
        }else {
            System.out.println("No Match: Try Again !");
        }
    }
}
