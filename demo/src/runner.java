public class runner {
    public static void main(String[] args) {
        double distance = 15.0 ;
        double distanceinmiles = distance * 0.621371;
        double minutes = 50.0 ;
        double seconds = 30.0;
        double totaltime = (minutes / 60.0) + (seconds / 3600.0);
        double speed = (distanceinmiles / totaltime);
        System.out.println(speed);
    }
}
