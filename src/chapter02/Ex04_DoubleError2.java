package chapter02;

public class Ex04_DoubleError2 {
    public static void main(String[] args) {
        double dNum = 0.09;
        for (int i = 0; i < 1000; i = i + 1) {
            dNum = dNum + 0.1;
        }
        System.out.println(dNum);
    }
}
