public class usacensus {
    public static void main(String[] args) {
        int currentpopulation = 312032486;
        int timeTotal =  5 * 365 * 24 * 60 *60;
        //This calculates the time of all the people in a country

        //Now every statistic provided to us
        long births = timeTotal/7;
        long death = timeTotal/13;
        long immigrant = timeTotal/45;

        //Projected Population of the country for five years, is
        long projectPopulation = currentpopulation + (births - death + immigrant);
        System.out.println(projectPopulation);
    }
}
