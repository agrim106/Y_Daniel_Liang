import java.util.*;

//Write a program that reads the subtotal and the gratuity rate and then computes the gratuity in total.
public class FinancialApplications {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount : ");
            double amount = sc.nextDouble();
            System.out.println("Enter the gratuity rate: ");
            double gratuityRate = sc.nextDouble();

            double gratuity = amount * (gratuityRate/100);
            double subtotal = gratuity + amount;
            System.out.println("The gratuity is : $" + gratuity + "and the subtotal is : $ " + subtotal);

    }
}
