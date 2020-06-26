import java.io.*;
import java.util.Scanner;

/*Write a utility program that combines the files together into a new file using the following command:
java Exercise SourceFile1 . . . SourceFilen TargetFile
The command combines SourceFile1, . . . , and SourceFilen into TargetFile.*/

public class nFileCombination {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter number of files :: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        String[] files = new String[n];
        for(i = 0; i < n; i++) {
            System.out.print("Enter name of file :: ");
            files[i] = scanner.nextLine() + ".txt";
        }

        FileInputStream[] fin = new FileInputStream[n];
        for(i = 0; i < n; i++) {
            try {
                fin[i] = new FileInputStream(files[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            FileOutputStream fout = new FileOutputStream("targetFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int data;
        for(i = 0; i < n; i++) {
            try{
                while((data = fin[i].read()) != -1);
            }
            catch(Exception e) {
                System.out.println(e);
            }

        }
    }
}
