//WAP TO SHOW LIST OF ALL THE TEXT FILE'S NAME FROM A DIRECTORY
import java.io.*;
//import java.io.FilenameFilter;

public class file1 {
    public static void main(String[] args) {
        String path = "/home/criminal/myFiles/lpu/operatingSystem";
        File f = new File(path);
        File file[] = f.listFiles();

        String name = "abcde.txt";
        String newString[] = name.split(".txt");
        System.out.println(newString[0]);

        for(File x : file)
            if(x.getName().endsWith(".txt"))  System.out.println(x.getName());
        //if(x.getName().split(".txt")[0].endsWith("z"))  System.out.println(x.getName());
    }
}
