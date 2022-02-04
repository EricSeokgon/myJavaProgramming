package chapter24;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class Ex06_FileCopy2 {
    public static void main(String[] args) {
        String src = "src/chapter24/Ex04_FileRead.java";
        String dst = "FileRead2.txt";

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {

            byte[] buf = new byte[1024];
            int len;

            Instant start = Instant.now();

            while (true) {
                len = in.read();
                if (len == -1)
                    break;
                out.write(buf, 0, len);
            }
            Instant end = Instant.now();
            System.out.println("복사에 걸린 시간:" + Duration.between(start, end).toMillis());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
