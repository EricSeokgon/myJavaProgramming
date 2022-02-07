package chapter24;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class Ex07_FileCopy3 {
    public static void main(String[] args) {
        String src = "src/chapter24/Ex04_FileRead.java";
        String dst = "FileRead3.txt";

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
            Instant start = Instant.now();

            int data;
            while (true) {
                data = in.read();
                if (data == -1)
                    break;
                out.write(data);
            }
            Instant end = Instant.now();
            System.out.println("복사에 걸린 시간: " + Duration.between(start, end).toMillis());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
