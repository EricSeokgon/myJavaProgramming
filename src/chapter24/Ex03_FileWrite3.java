package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_FileWrite3 {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("data.txt")) {
            out.write(65);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
