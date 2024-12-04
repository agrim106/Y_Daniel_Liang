//Write a kids test, Ask them the subtraction of two numbers and if the numbers are wrong correct them.

import java.util.*;

public class kidtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 for subtraction");
        int number1 = sc.nextInt();
        System.out.println("Enter number2 for subtraction");
        int number2 = sc.nextInt();

        //Writing out the result.
        int result = number1 - number2;

        System.out.println("Enter the intended outcome of subtraction here: ");
        int kidOutput= sc.nextInt();
        if(kidOutput==result){
            System.out.println("You are correct: " + result + " is the answer");
        }else{
            System.out.println("You are wrong! " + kidOutput + " is the wrong answer, the real answer is : " + result);
        }

    }
}
