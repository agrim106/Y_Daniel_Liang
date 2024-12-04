//Write a program, that displays the current time in GMT.
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class showCurrentTime {
    public static void main(String[] args) {
        // Get the current instant in time
        Instant now = Instant.now();

        // Convert the instant to GMT time zone
        ZonedDateTime gmtTime = now.atZone(ZoneId.of("GMT"));

        // Format the time for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Print the current time in GMT
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
    }
}

