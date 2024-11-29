package com.venkatscode.dsa.pps50;

import java.util.HashMap;

public class PPS3TwoSum {
    private static int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int i =0;
        int complement = 0;
        for(int num:nums){
            complement = target-num;
            if(indexMap.containsKey(complement)){
                return new int[]{indexMap.get(complement), i};
            }
            indexMap.put(num,i++);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3,2,4},6);
        System.out.println(result);
    }
}
