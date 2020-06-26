import java.time.*;

public class Date2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

        System.out.println("getYear :: " + date1.getYear());
        System.out.println("getMonthValue :: " + date1.getMonthValue());
        System.out.println("getMonth :: " + date1.getMonth());
        System.out.println("getDayOfMonth :: " + date1.getDayOfMonth());
        System.out.println("getDayOfYear :: " + date1.getDayOfYear());
        System.out.println("getDayOfWeek :: " + date1.getDayOfWeek());
        System.out.println("isLeapYear :: " + date1.isLeapYear());

        //System.out.println("isAfter :: " + date1.isLeapYear());
        //System.out.println("isBefore :: " + date1.isLeapYear());
    }
}
