import java.util.Scanner;
import java.time.*;

public class Date3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date in the format :: YYYY-MM-DD :: ");
        String date = sc.nextLine();

        LocalDate Date = LocalDate.parse(date);
        System.out.println(Date);

        LocalDate currentDate = LocalDate.now();

        if(Date.isBefore(currentDate))
            System.out.println("it is past");
        else
            System.out.println("it is future");

        System.out.println("isLeapYear :: " + Date.isLeapYear());
        System.out.println("getDayOfWeek :: " + Date.getDayOfWeek());
        System.out.println("getDayOfMonth :: " + Date.getDayOfMonth());


        System.out.println("current date :: " + currentDate);
        System.out.println("day after 1 month from now :: " + currentDate.plusMonths(1).getDayOfWeek());

        sc.close();
    }
}
