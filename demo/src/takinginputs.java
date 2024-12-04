import java.util.*;
//This is called as a wildcard import.
public class takinginputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // We are going to write a program to calculate an area of a circle.
        double radius = sc.nextDouble();
        double area = (3.14159 * radius * radius);
        System.out.println("the area of a circle is : " + area);


    }
}
