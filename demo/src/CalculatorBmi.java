//Writing a code to display BMI

import java.util.*;
public class CalculatorBmi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input for weight
        System.out.println("Enter weight in lbs");
        double weight = sc.nextDouble();
        //Taking input of height
        System.out.println("Enter height in inches");
        double height = sc.nextDouble();
        //Converting weight in kgs.
        double weight_in_kgs = weight * 0.45359237;
        //Converting height in meters.
        double height_in_meters = height * 0.0254;
        //calculating BMI
        double bmi = weight_in_kgs / (height_in_meters * height_in_meters);
        if(bmi>=25){
            System.out.println("You are above the scale ");
        }else{
            System.out.println("You are normal");
        }
        System.out.println("Your BMI is: " + bmi);

    }
}