package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02_FileWrite2 {
    public static void main(String[] args) {
        OutputStream out = null;

        try {
            out = new FileOutputStream("data.txt");
            out.write(65);
        } catch (IOException e) {

        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {

                }

            }
        }

    }
}
