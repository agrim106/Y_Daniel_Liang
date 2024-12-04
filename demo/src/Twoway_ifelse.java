// Write a statement that assigns 1 to x if Y is greater than 0.

import java.util.*;

public class Twoway_ifelse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if(y>0){
        System.out.println("x = 1");
    }else{
        System.out.println(y);
    }
    }
}
