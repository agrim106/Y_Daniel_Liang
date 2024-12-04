//Question : If today is tuesday what will be the day in 100 days.

public class calenders {
    public static void main(String[] args) {
        String[] week = {"sunday" , "Monday", "tuesday" , "wednesday" , "thursday" , "friday" , "saturday" };
        int today = 2;

        int daystoadd = 100;
        int dayindex = (today + daystoadd)%7;
        System.out.println(week[dayindex]);

    }
}
