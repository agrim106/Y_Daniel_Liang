//Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100  . Write a boolean expression that evaluates to true if the number is between 1 and 100 and or the number is negative;

import java.util.*;

public class TestingBooleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        //If-else statements with boolean and logical operators.
        if(num>=1 && num<=100){
            boolean integers = true;
            System.out.println(integers);
        }else{
            System.out.println("false");
        }

    }
}
