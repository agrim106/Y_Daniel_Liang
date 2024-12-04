//Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month .
import java.util.*;

public class Financial_application  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the balance");
        int balance = sc.nextInt();
        System.out.println("enter the rate Of Interest");
        double rate = sc.nextInt();
        double interest =  balance * (rate/1200);
        System.out.println("The interest is : " + interest);
    }
}
