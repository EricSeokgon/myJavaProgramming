package chapter16;

import java.util.Scanner;

public class Ex08_WhyThow {
    public static void main(String[] args) {
        myMethod1();
        myMethod2();
    }

    private static void myMethod1() {
        try {
            myMethodA();
        } catch (Throwable e) {
            System.out.println("에러 !!!");
        }
    }

    private static void myMethod2() {
        try {
            myMethodA();
        } catch (Throwable e) {
            System.out.println("Error !!!");
        }
    }

    private static void myMethodA() {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = 10 / num1;
        System.out.println(num2);
    }


}
