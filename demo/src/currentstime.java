public class currentstime{
    public static void main(String[] args) {
        //Writing out a program which prints time. From the date 1 Jan 1970.
        long totalMilliseconds = System.currentTimeMillis();

        // Writing the total seconds since midnight of 1 Jan 1970.
        long totalSeconds = totalMilliseconds / 1000 ;

        //Compute the current second in the minute in the hour.
        long currentSecond = totalSeconds % 60 ;

        //Writing the total minutes
        long totalMinutes = totalSeconds / 60 ;

        //Writing the current minute in the hour
        long currentMinute = totalMinutes % 60 ;

        //Writing the total hours
        long totalHours = totalMinutes / 60;

        //Writing the current hours.
        long currentHour = totalHours % 24;

        //Printing the output.
        System.out.println("The time is : " + currentHour + " : " + currentMinute + " :" + currentSecond + " GMT ");
    }
}