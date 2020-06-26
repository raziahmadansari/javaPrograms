import java.util.Scanner;

public class sameCharCount {
    static int count = 0;

    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 names...");
        s1 = new String(sc.nextLine());
        s2 = new String(sc.nextLine());



        for(int i=0; i<s1.length(); i++) {
            for(int j=0; j<s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j))
                    count++;
            }
        }
        System.out.println(count);
    }
}
