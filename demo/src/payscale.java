//Write an if statement that increases pay by 3% if score if greater than 90, otherwise increase pay by 1% .

import java.util.*;

public class payscale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Pay: ");
        double pay = sc.nextInt();
        System.out.println("Enter your Score: ");
        double score = sc.nextDouble();

        //Now writing if else statements.
        if(score >=90){
            pay = pay + (pay * 0.3);
            System.out.println("Your pay has been increased, Your new pay is : $ " + pay);
        }else{
            pay = pay + (pay * 0.1);
            System.out.println("Your pay is : $ " + pay);
        }
    }
}
