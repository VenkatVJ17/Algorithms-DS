package com.venkatscode;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        mergeTwoIntArrays(new int[]{1,3,5,7},new int[]{2,4,6,8});
        //removeEven(new int[]{1, 2, 3, 4});
    }

    private static void mergeTwoIntArrays(int[] a, int[] b) {
        int al = a.length;
        int bl= b.length;
        int[] c = new int[al+bl];
        int k =0;
        int l = 0;
        for(int i=0;i<a.length;i++){
            c[i] = a[i];
        }
        for(int i =0;i<b.length;i++){
            c[a.length+i]= b[i];
        }
        int temp;
        int min = c[0];
        for(int i=0;i<c.length;i++){
                if(c[i]<min){
                    temp = c[i];
                    c[i] = min;
                    min = temp;

                }
        }
        System.out.println("Before Merge A is ");
        Arrays.stream(a).forEach(System.out::println);
        System.out.println("Before Merge B is ");
        Arrays.stream(b).forEach(System.out::println);
        System.out.println("After Merge C is ");
        Arrays.stream(c).forEach(System.out::println);
    }


    private static int[] removeEven(int[] ints) {
        return Arrays.stream(ints)
                .filter(x -> x%2 !=0)
                .toArray();
    }
}
