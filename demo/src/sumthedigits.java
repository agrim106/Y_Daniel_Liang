//Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
/*For example if an integer is 932 then the sum of all its digits is 14.*/
import java.util.*;

public class sumthedigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit between 1 and 1000");
        int numbers = sc.nextInt();
        int sum = 0;
        //Extract and sum each digit.

        while(numbers>0){
            int digit = numbers % 10; // get the Last digit out.
            sum += digit; //add it to the sum.
            numbers /= 10; //Remove the digit.


        }
        System.out.println("The sum of the digits is : " + sum);
    }
}