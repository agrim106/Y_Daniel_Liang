//Writing a program, calculating taxes owed but using switch Statements in this one.

import java.util.*;

public class ComputingTaxesOnSwitchStatements {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income : ");
        int income = sc.nextInt();

        double tax = 0;
        //Checking for Marital status.
        System.out.println("Enter Marital status: 0 for single , 1 for married filing jointly , 2 for married married filing separately , 3 for divorced/widowed , 4 for Head of Household");
        int status = sc.nextInt();

        //Writing switch Statements.
        switch (status){
            case 0 : tax = income - (income * 0.15);
                System.out.println("Your income after tax is : $ " + tax);
                break;
            case 1 : tax = income - (income * 0.12);
                System.out.println("Your income after tax is : $ " + tax);
                break;
            case 2 : tax = income - (income * 0.8);
                System.out.println("Your income after tax is : $ " + tax);
                break;
            case 3 : tax = income - (income * 0.16);
                System.out.println("Your income after tax is : $ " + tax);
                break;
            case 4 : tax = income - (income * 0.03);
                System.out.println("Your income after tax is : $ " + tax);
                break;

        }
    }
}
