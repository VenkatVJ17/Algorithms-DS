package com.venkatscode;

import java.util.Arrays;

public class CircularArrayLoop {
    public static void main(String[] args) {

        int[][] input = {
                {-2, -3, -9},
                {-5, -4, -3, -2, -1},
                {-1, -2, -3, -4, -5},
                {2, 1, -1, -2},
                {-1, -2, -3, -4, -5, 6},
                {1, 2, -3, 3, 4, 7, 1},
                {2, 2, 2, 7, 2, -1, 2, -1, -1}
        };

        for (int i = 0; i < input.length; i++) {
            System.out.println((i + 1) + ".\tCircular array = " + Arrays.toString(input[i]) + "\n");
            boolean result = detectCircularArray(input[i]);
            System.out.println("\tFound Loop = " + result);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

    private static boolean detectCircularArray(int[] ints) {
        int size = ints.length;
        int slow,fast =0;
        for(int i=0;i<size;i++){
            slow=fast=i;
            boolean isForward = ints[i]>=0;
            while(true){
                slow = getNextIndex(slow,ints,isForward);
                if(slow==-1){
                    break;
                }
                fast = getNextIndex(fast,ints,isForward);
                if(fast==-1){
                    break;
                }
                fast = getNextIndex(fast,ints,isForward);
                if(fast==-1){
                    break;
                }
                if(fast==slow){
                    return true;
                }
            }
        }
        return false;
    }

    private static int getNextIndex(int currIndex, int[] ints, boolean isForward) {
        boolean direc = ints[currIndex]>=0;
        if(direc!=isForward){
            return -1;
        }

        int nextInd = (ints[currIndex]+currIndex)%ints.length;

        if(nextInd < 0){
            nextInd = nextInd+ints.length;
        }
        if(nextInd==currIndex){
            return -1;
        }
        return nextInd;
    }
}
