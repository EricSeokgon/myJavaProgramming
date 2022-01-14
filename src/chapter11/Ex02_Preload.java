package chapter11;

import java.util.Random;

public class Ex02_Preload {
    static int num;

    static {
        Random rand = new Random();
        num = rand.nextInt(100);
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
