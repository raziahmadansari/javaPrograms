import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sb = new String[3];

        System.out.println("Enter 3 baby names...");
        for(int i=0; i < 3; i++) {
            System.out.print(i + 1 + ": ");
            sb[i] = sc.nextLine();
        }

        for(int i = 1; i < 3; i++) {
            System.out.println(String.join(" ", sb[0], sb[i]));
        }
    }
}
