//Writing a program to compute personal income.

import java.util.*;

public class Computing_TAXES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your personal Income: ");
        double income = sc.nextDouble();
        System.out.println("Enter Your marital Status , Press 0 for Single , 1 for Married filing jointly , 2 for Married Filing separately , 3 for head of Household");
        double status = sc.nextDouble();

        //Declaring a tax variable
        double tax = 0 ;
        //Computing Taxes for each group
        if(status ==0){
            //Tax for singles
            tax = income - (income * 0.15);
            System.out.println("Your Tax Deductible income is : $ " + tax);
        }else if(status ==1 ){
            //Tax for Married people.
            tax = income - (income * 0.12);
            System.out.println("Your Tax deductible Income is : $ " + tax);
        }else if(status ==2){
            //Tax for married but filing Separately, is:
            tax = income - (income * 0.9);
            System.out.println("Your Tax deductible Income is : $ " + tax);
        }else if(status ==3){
            //Tax for Head of Household
            tax = income - (income * 0.14);
            System.out.println("Your Tax Deductible Income is : $ " + tax);

        }else{
            System.out.println("Invalid Info entered. ");
        }
    }
}
