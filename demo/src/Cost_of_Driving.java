// Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon and the price per gallon then displays the cost of the trip

import java.util.*; //This is called a wildcard input class.

public class Cost_of_Driving {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the driving Distance : ");
        double distance = sc.nextDouble();
        System.out.println("Enter the miles per gallon : ");
        double miles = sc.nextDouble();
        System.out.println("Enter the price per gallon of gas : ");
        double gas_Price = sc.nextDouble();

        //Calculating the cost of driving.
        double cost_ofDriving = (distance / miles) * gas_Price ;
        System.out.println("The cost of Driving is : $ " + cost_ofDriving);
    }
}
