import java.util.*;

//Writing a code for calculation of computing Change.

public class ComputingChange {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Receive the amount.
        System.out.println("Enter an amount");
        double amount = sc.nextDouble();

        int remainingAmount = (int)(amount*100);

        //Find the number of dollars
        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaining Amount.
        int quarters = remainingAmount /25;
        remainingAmount = remainingAmount % 25;

        //Find the number of dimes in the remaining amount
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        //Find the number of nickels in the amount.
        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        //Find the remaining pennies.
        System.out.println("Your amount  $ " + amount + "  consists of ");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickels + "nickels");
        System.out.println(" "+ remainingAmount + "Pennies");




    }
}
