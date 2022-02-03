package chapter23;

import org.w3c.dom.ranges.DocumentRange;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ex05_Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");

        list.stream()
                .map(s -> s.toUpperCase())
                .forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }
}
