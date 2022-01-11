package chapter08;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();

            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num > 4) {
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue;
                }

                System.out.println("첫 번째 숫자 : ");
                int num1 = sc.nextInt();

                System.out.println("두 번째 숫자 : ");
                int num2 = sc.nextInt();

                if (num1 == 1) {
                    addNum(num1, num2);
                } else if (num == 2) {
                    minusNum(num1, num2);
                } else if (num == 3) {
                    multiplyNum(num1, num2);
                } else if (num == 4) {
                    divideNum(num1, num2);
                }
            }
        }
        System.out.println("계산기를 종료합니다.");

    }

    private static void divideNum(int num1, int num2) {
        int result1 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result1);

        int result2 = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result2);
    }

    private static void multiplyNum(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    private static void minusNum(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    private static void addNum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    private static void showMenu() {
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1.더하기");
        System.out.println("2.빼기");
        System.out.println("3.곱하기");
        System.out.println("4.나누기");
        System.out.println("0.끝내기");

    }


}
