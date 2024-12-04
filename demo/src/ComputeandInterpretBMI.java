import java.util.*;

public class ComputeandInterpretBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user's physical data
        System.out.println("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = sc.nextDouble();

        // Calculating BMI
        double bmi = weight / (height * height);

        // Interpreting BMI value
        if (bmi >= 25) {
            System.out.println("You are overweight. Reduce weight to improve health!");
        } else if (bmi >= 18.5) {
            System.out.println("You are normal!");
        } else {
            System.out.println("You are below average weight. Increase your weight.");
        }

        // Displaying the BMI value
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}
