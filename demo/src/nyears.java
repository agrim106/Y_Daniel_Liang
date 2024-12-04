//Write a program that prompts user to enter the amount of minutes and displays the maximum years and days the minutes would have.

import java.util.*;
public class nyears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of minutes: ");
        long minutes = sc.nextLong();
        //Converting the minutes to years
        long years = minutes/(365*24*60);
        // Remaining minutes converted to days
        long remainingMinutes = minutes % (365 * 24 * 60);
        long days = remainingMinutes / (24 * 60);
        System.out.println("The amount of minutes is approximately: " + years + " years and " + days + " days.");
    }
}
