package chapter03;

public class Ex01_Finaluse {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 60;

        int myScore = 40;

        if (myScore < MIN_NUM) {
            System.out.println("당신의 등급은 F입니다.");

        }
    }
}
