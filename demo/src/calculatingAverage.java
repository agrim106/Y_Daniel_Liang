import java.util.*;
//This is a wildcard import.

public class calculatingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // calculation of averages now.
        int average = (number1 + number2 + number3)/3;
        System.out.println("the Average of the numbers are : " + average);
    }
}
