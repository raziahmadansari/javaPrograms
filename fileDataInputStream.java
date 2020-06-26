import java.io.*;

public class fileDataInputStream {
    public static void main(String[] args) {
        try (DataInputStream din = new DataInputStream(new FileInputStream("in.txt"));) {
            int i;
            while((i = din.readInt()) != -1)
                System.out.println(i);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
