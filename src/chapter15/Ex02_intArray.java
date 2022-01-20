package chapter15;

public class Ex02_intArray {
    public static void main(String[] args) {
        int[] ar = new int[3];

        ar[0] = 100;
        ar[2] = 90;
        ar[2] = 80;

        int sum = ar[0] + ar[1] + ar[2];
        System.out.println("총점 : " + sum);
    }
}

