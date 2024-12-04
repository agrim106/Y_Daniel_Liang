import java.util.*;

public class Fahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in celsius");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int fahrenheit = ((temp * 9/5) + 32);
        System.out.println("The temperature in fahrenheit is : " + fahrenheit);

    }
}
