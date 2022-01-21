package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            int num2 = 10 / num1;
            System.out.println(num2);
        } catch (ArithmeticException e) {
            String str = e.getMessage();
            System.out.println(str);
            if (str.equals("/ by zero")) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Good bye~~~~");
        }
    }
}
