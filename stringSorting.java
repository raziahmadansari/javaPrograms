import java.util.Arrays;

public class stringSorting {
    public static void main(String[] args) {
        String[] strings = {"razi", "ahmad", "ansari"};

        int size = strings.length;

        for(int i = 0; i < size-1; i++) {
            for(int j = i + 1; j < size; j++) {
                if(strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        String newString = Arrays.toString(strings);
        System.out.println(newString);

        for(int i = 0; i < strings.length; i++)
            System.out.print(strings[i] + " ");
    }
}
