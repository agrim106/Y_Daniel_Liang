//Write an if statement that increases pay by 3% if score is greater than 90.

import java.util.*;

public class IncreasesPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = sc.nextInt();
        if(score>= 90){
          double increasePay = score + (score * 0.03);
            System.out.println("Congrats, Your new pay is : $ " + increasePay);
        }else{
            System.out.println("Your Pay is the same.");
        }
    }
}
