import java.util.*;

//Writing a program that computes Loan.
public class ComputingLoans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter the principal amount.
        System.out.println("Enter the principal Amount");
        int principalAmount = sc.nextInt();
        double rate = 6.63;
        //Enter the time. In months.
        System.out.println("Enter the time in months.");
        int time = sc.nextInt();

        long simpleInterest = ((long)(principalAmount*rate*time)/100);
        long interestInMonths = (simpleInterest/time);
        System.out.println("Your rate of  interest is : $ " + simpleInterest + " Your monthly payments will be: $ " + interestInMonths);

    }
}
