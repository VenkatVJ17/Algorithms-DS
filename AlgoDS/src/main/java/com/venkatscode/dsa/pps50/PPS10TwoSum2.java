package com.venkatscode.dsa.pps50;


import java.util.Arrays;
import java.util.HashMap;

public class PPS10TwoSum2 {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15},9);
        Arrays.toString(result);
    }

    private static int[] twoSum(int[] ints, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<ints.length;i++){
            int complement = target-ints[i];
            if(hmap.containsKey(complement)){
                return new int[]{hmap.get(complement),i+1};
            }
            hmap.put(ints[i],i+1);
        }
        return new int[]{};
    }
}
