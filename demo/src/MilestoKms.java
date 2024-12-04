import java.util.*;

public class MilestoKms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of miles.");
        double miles_To_kilometers = sc.nextDouble();
        double kilometers = 1.6 * miles_To_kilometers;
        System.out.println("The Kilometers are : " + kilometers);
    }
}
