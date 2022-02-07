package chapter25;

public class Ex07_SyncMethod {
    public static int money = 0;

    public synchronized static void deposit() {
        money++;
    }

    public synchronized static void withdraw() {
        money--;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable tast1 = () -> {
            for (int i = 0; i < 1000; i++) {
                deposit();
            }
        };

        Runnable tast2 = () -> {
            for (int i = 0; i < 1000; i++) {
                withdraw();
            }
        };

        Thread t1 = new Thread(tast1);
        Thread t2 = new Thread(tast2);

        t1.start();
        t2.start();

        t1.join(); //t1이 참조하는 스레드의 종료를 기다림
        t2.join();

        System.out.println(money);

    }
}
