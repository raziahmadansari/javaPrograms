import java.util.Scanner;
public class ca1_2 {
    public static void main(String[] args) {
        int SIZE = 5;
        double[] marks = new double[SIZE];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of " + SIZE + " students...");

        for(int i = 0; i < SIZE; i++) {
            System.out.print("Student :: " + i + ", marks :: ");
            marks[i] = sc.nextDouble();
        }

        count(marks);
    }
    private static void count(double[] marks) {
        int count = 0;
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] < 50)
                count++;
        }
        System.out.println("Number of Students having less than 50% marks are :: " + count);
    }
}
