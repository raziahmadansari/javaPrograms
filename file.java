import java.io.*;

public class file {
    public static void main(String[] args) {
        try{
            //File f = new File("/home/criminal/IdeaProjects/practice/src/textFile.txt");
            File f = new File("//home//criminal//IdeaProjects//practice//src//textFile.txt");
            System.out.println("isFile = " + f.isFile());
        }
        catch(Exception e) {
            System.out.println("Exception caught :: " + e);
        }
    }
}
