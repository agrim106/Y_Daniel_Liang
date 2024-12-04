// Write a program that randomly generates an integer between 1 and 7 and displays the name of the color in the rainbow. Remember the color of Rainbow are VIBGYOR.



public class RandomColor {
    public static void main(String[] args) {
    //Generating a number.
        int num = (int)(Math.random() * 10);

        //Picking colors.
        switch(num){
            case 0 :
                System.out.println("The color for " + num + "is Red ");
                break;
            case 1 :  System.out.println("The color for " + num + "is Orange ");
                break;
            case 2 :  System.out.println("The color for " + num + "is Yellow ");
                break;
            case 3 : System.out.println("The color for " + num + "is Green ");
                break;
            case 4 : System.out.println("The color for " + num + "is Blue ");
                break;
            case 5 : System.out.println("The color for " + num + "is Indigo ");
                break;
            case 6 : System.out.println("The color for " + num + "is Violet. ");
                break;
            case 7:
                System.out.println("No color");
                break;
            case 8:
                System.out.println("No color for 8 ");
                break;
            case 9:
                System.out.println("No color for 9");
                break;
            case 10:
                System.out.println("No color 10");
                break;
        }
    }
}
