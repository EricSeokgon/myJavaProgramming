package chapter08;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showMenu();
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
