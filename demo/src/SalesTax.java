import java.util.*;

public class SalesTax {
    public static void main(String[] args) {
    //Writing a code for calculating sales tax.
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase Amount");
    double purchaseAmount = sc.nextDouble();
    double salesTax = purchaseAmount * 0.06;
        System.out.println("Your Sales Tax is : $" +(int)(salesTax*100)/100);
    }
}
