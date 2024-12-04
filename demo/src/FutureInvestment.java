//Write a program that reads in investment amount, annual interest rate and number of years and displays the future investment value.

import java.util.*;
public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal Amount");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter the rate of Interest ");
        double rate = sc.nextDouble();
        System.out.println("Enter the amount of time ");
        double time = sc.nextDouble();

        double monthlyInterestRate = rate / 100 / 12 ;
        //Calculating Future investment value, via formula

        double futureInvestmentValue = principalAmount *Math.pow(( 1 + monthlyInterestRate),(time * 12));

        System.out.println("The future investment Value is  : $ " + futureInvestmentValue);

    }
}
