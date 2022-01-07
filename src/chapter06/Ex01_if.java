package chapter06;

public class Ex01_if {
    public static void main(String[] args) {
        int num = 100;
        if (num > 50) {
            System.out.println("num 변수의 길이 50보다 큽니다.");
        }

        if (num > 50)
            System.out.println("num 변수의 길이 50보다 큽니다.");

        if (num > 50) System.out.println("num 변수의 길이 50보다 큽니다.");

        if (num < 50)
            System.out.println(num);
            System.out.println("num 변수의 길이 50보다 작습니다.");
    }
}
