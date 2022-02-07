package chapter25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex08_ThreadPool1 {
    public static int money = 0;

    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 10000; i++) {
                money++;
            }

            String name = Thread.currentThread().getName();
            System.out.println(name + " : " + money);
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 10000; i++) {
                money--;
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + " : " + money);
        };

        ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.submit(task1);
        pool.submit(task2);

        System.out.println("End " + Thread.currentThread().getName());
        pool.shutdown();
    }
}
