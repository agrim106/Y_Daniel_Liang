//Write a program that simulates a lottery machine, user would enter two random numbers and if they match, The user wins a lottery.

import java.util.*;

public class Lottery_CaseStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Choosing numbers at random
        int lottery = (int) (Math.random() * 100);
        //Getting input from the user.
        System.out.println("Enter a number two digits : ");
        int guess = sc.nextInt();

        //Get digits from lottery
        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery % 10;

        //Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The Lottery is : " + lottery);

        //Check the guess
        if(guess==lottery){
            System.out.println("Exact Match: You get to win $10000");
        }else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2){
            System.out.println("Congrats you win $ 3000");
        }else if(guessDigit1 ==lotteryDigit1 || guessDigit1 ==lotteryDigit2 || guessDigit2==lotteryDigit1 || guessDigit2 ==lotteryDigit2){
            System.out.println("One digit match: You win $1000");
        }else {
            System.out.println("Sorry ! no match: Try Again.");
        }

    }
}
