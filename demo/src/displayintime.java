import java.util.*;

public class displayintime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer for a second");
        int seconds = sc.nextInt();
        int minutes = seconds/ 60;
        int remainingseconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingseconds + "seconds");
    }
}
