package chapter24;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex01_FileWrite1 {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("data.txt");
        out.write(65);
        out.close();
    }
}
