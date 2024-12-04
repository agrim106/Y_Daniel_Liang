//Creating a Grading chart for students.

import java.util.*;

public class GradingChart {
    public static void main(String[] args) {
        //Writing a grading chart, for children
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the marks Obtained");
        int marks = sc.nextInt();

        if(marks>=95){
            System.out.println("excellent:  O ");
        }else if(marks>=90){
            System.out.println("Good : A++");
        }else if(marks>=80){
            System.out.println("Nice: A+");
        }else if(marks>=70){
            System.out.println("Good effort : A");
        }else if(marks >=60){
            System.out.println("Average: B-");
        }else{
            System.out.println("E");
        }
    }
}
