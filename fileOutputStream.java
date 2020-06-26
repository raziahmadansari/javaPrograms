import java.io.*;

/*Write a program to create a file named Exercise1.txt if it does not exist. Append new data to it if it already exists.
Write 100 integers created into the file using text I/O. Integers should be separated by a space.*/

public class fileOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Excercise.txt", true));
        String s;
        int i = 0;
        for(; i < 101 ; i++) {
            try {
                s = i + " ";
                dataOutputStream.writeBytes(s);
                dataOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
