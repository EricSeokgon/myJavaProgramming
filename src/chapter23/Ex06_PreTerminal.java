package chapter23;

import java.util.stream.IntStream;

public class Ex06_PreTerminal {
    public static void main(String[] args) {
        //합
        int sum = IntStream.of(1, 3, 5, 7, 9)
                .sum();
        System.out.println("sum = " + sum);

        //개수
        long cnt = IntStream.of(1, 3, 5, 7, 9)
                .count();
        System.out.println("count = " + cnt);

        //평균

        IntStream.of(1, 3, 5, 7, 9)
                .average()
                .ifPresent(avg -> System.out.print("avg = " + avg));

        //최소
        IntStream.of(1, 3, 5, 7, 9)
                .min()
                .ifPresent(min -> System.out.print("min = " + min));

        //최대
        IntStream.of(1, 3, 5, 7, 9)
                .max()
                .ifPresent(max -> System.out.print("max = " + max));


    }

}
