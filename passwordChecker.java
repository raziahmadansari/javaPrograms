import java.util.regex.Pattern;

public class passwordChecker {
    public static void main(String[] args) {
        String s1 = new String("123razi");
        System.out.println(s1.matches(".*\\d+.*"));
        System.out.println(Pattern.matches("[a-zA-Z]+", s1));
    }
}
