import java.util.Scanner;

public class CountSpaces {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name to count spaces:: ");
        String s = new String(sc.nextLine());

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ')
                count++;
        }
        System.out.println("number of spaces = " + count);
    }
}
