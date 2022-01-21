package chapter16;

public class Ex07_CatchTrowable {
    public static void myMethod1(int n) {
        myMethod2(n, 0);
    }

    private static void myMethod2(int n1, int n2) {
        int r = n1 / n2;
    }

    public static void main(String[] args) {
        try {
            myMethod1(3);
        } catch (Throwable e) {
            e.printStackTrace();
            //   System.out.println("Exception Throw !!!");
        }
    }
}
