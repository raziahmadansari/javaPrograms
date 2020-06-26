import java.time.*;
import java.time.temporal.ChronoUnit;

public class time {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime lt1 = LocalTime.of(10, 15, 11);
        LocalTime lt2 = LocalTime.parse("21:15:10");

        System.out.println(currentTime);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println("Difference :: " + currentTime.until(lt2, ChronoUnit.MINUTES));
    }
}
