package chapter06;

public class Ex06_forExtension {
    public static void main(String[] args) {
        int i = 0;

        for (; i < 10; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        i = 0;
        for (; i < 10; ) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 0; j < 10; j = j + 2) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
