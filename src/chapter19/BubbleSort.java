package chapter19;

import java.util.Scanner;

public class BubbleSort {
    public static void getNumber(int[] num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10개의 정수를 무작위로 입력하세요.");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
    }

    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] num = new int[10];

        getNumber(num);

        bubbleSort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
