import java.util.Scanner;

class Loan {
    long principal;
    long roi;
    long time;

    Loan(long principal, long roi, long time) {
        this.principal = principal;
        this.roi = roi;
        this.time = time;
    }



    long calculate() {
        return ((principal * time * roi) / 100);
    }
}

public class ca3Anurag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal :: ");
        long p = scanner.nextLong();
        System.out.print("Enter roi :: ");
        long roi = scanner.nextLong();
        System.out.print("Enter time :: ");
        long time = scanner.nextLong();

        assert p > 0 : "principal is invalid";
        assert roi > 0 : "roi is invalid";
        assert time > 0 : "time is invalid";

        Loan l1 = new Loan(p, roi, time);
        System.out.println("loan is :: " + l1.calculate());
    }
}
