import java.util.Scanner;

public class ca3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        try {
            if(number < 0)  throw new ArithmeticException("e");

            boolean ans = true;
            for(int i = 2; i < number; i++) {
                if (number % i == 0) {
                    ans = false;
                    break;
                }
            }
            if(ans == true) System.out.println("entered number is prime");
            else    System.out.println("entered number is not prime");
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
