import java.time.*;
import java.time.temporal.ChronoUnit;

public class dateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zone = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zone);

        LocalTime localTime = LocalTime.now();

        System.out.println(localDateTime);
        System.out.println("getHour :: " + localDateTime.getHour());
        System.out.println("Tokyo time :: " + time1);
        System.out.println("localTime - TokyoTime :: " + localTime.until(time1, ChronoUnit.MINUTES));
    }
}
