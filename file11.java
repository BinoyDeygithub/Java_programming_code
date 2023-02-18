package Java_projects;

import java.io.File;
import java.io.IOException;

public class file11 {
    public static void main(String[] args) {
        File myFile =new File("java_project");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unnable to create file");
            throw new RuntimeException(e);
        }
    }
}
