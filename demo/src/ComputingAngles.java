// Writing a program that computes the angles of a triangle.

import java.util.*;

public class ComputingAngles {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter three points: ");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();

        //Compute three sides
        double a = Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2-y3));
        double b = Math.sqrt((x1-x3) * (x1-x3) + (y1-y3) * (y1-y3));
        double c = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));

        //Compute three angles.
        double A = Math.toDegrees(Math.acos((a*a-b * b-c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a -c * c ) / (-2 * a * c)));
        double C = Math.toDegrees((Math.acos((c * c-b * b - a * a ) / (-2 * a * b))));

        //Display results.
        System.out.println("The three angles Are " + Math.round(A*100) / 100 + " " + Math.round(B*100) / 100 + " " + Math.round(C*100) /100);
    }
}
