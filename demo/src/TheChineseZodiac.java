//Write a program that calculates the chinese Zodiac. The chinese zodiac has, 12year cycle each having a different animal sign.

import java.util.*;

public class TheChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        //Calculating the zodiac.
        int zodiac = year % 12;

        /*Rat, Ox, Tiger, Rabbit, Dragon, Snake, Horse, Goat, Monkey, Rooster, Dog, Pig
        *
        * Rat: 4, Ox: 5, Tiger: 6, Rabbit: 7, Dragon: 8, Snake: 9, Horse: 10, Goat: 11, Monkey: 0, Rooster: 1, Dog: 2, Pig: 3*/
        //Writing swtich Statements now.
        switch(zodiac){
            case 0 :
                System.out.println("Your year " + year+ " is of the Monkey");
                break;
            case 1 :
                System.out.println("Your year " + year+ " is of the Rooster");
                break;
            case 2: System.out.println("Your year " + year+ " is of the Dog");
                break;
            case 3 : System.out.println("Your year " + year+ " is of the Pig");
                break;
            case 4 : System.out.println("Your year " + year+ " is of the Rat");
                break;
            case 5 : System.out.println("Your year " + year+ " is of the Ox");
                break;
            case 6 : System.out.println("Your year " + year+ " is of the Tiger");
                break;
            case 7 : System.out.println("Your year " + year+ " is of the Rabbit");
                break;
            case 8 : System.out.println("Your year " + year+ " is of the Dragon");
                break;
            case 9 : System.out.println("Your year " + year+ " is of the snake");
                break;
            case 10 : System.out.println("Your year " + year+ " is of the Horse");
                break;
            case 11 : System.out.println("Your year " + year+ " is of the Sheep");
                break;
        }
    }
}
