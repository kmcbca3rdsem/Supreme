package Lab4;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Java File Handling");
            fw.close();
            System.out.println("Data written to file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}