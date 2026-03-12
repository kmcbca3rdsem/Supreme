package Lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("sample.txt");
            FileOutputStream fout = new FileOutputStream("copy.txt");

            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}