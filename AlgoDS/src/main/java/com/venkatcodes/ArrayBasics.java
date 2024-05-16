package com.venkatcodes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayBasics {

    public static void main(String[] args) {
        removeEven(new int[]{1, 2, 3, 4});
    }

    private static void removeEven(int[] ints) {
        Arrays.stream(ints)
                .filter(x -> x%2 ==0)
                .forEach(System.out::println);
    }
}
