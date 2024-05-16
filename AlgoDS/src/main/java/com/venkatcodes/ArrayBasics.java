package com.venkatcodes;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {
        removeEven(new int[]{1, 2, 3, 4});
    }

    private static int[] removeEven(int[] ints) {
        return Arrays.stream(ints)
                .filter(x -> x%2 !=0)
                .toArray();
    }
}
