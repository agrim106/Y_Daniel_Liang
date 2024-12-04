//Write a program to define whether a year is leap year or not.

import java.util.*;


public class DeterminingLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :  ");
        double year = sc.nextInt();

        //Checking if a year is a leap year or not.
        boolean isLeapYear = (year % 4 == 0 && year % 100!=0 ) || (year % 400 == 0);
        System.out.println("The year : " + year + " is a leap year ? " + isLeapYear);
    }
}
