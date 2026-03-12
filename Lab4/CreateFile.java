package Lab4;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}