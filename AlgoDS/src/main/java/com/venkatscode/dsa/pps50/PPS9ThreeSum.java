package com.venkatscode.dsa.pps50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PPS9ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> resultList = threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(resultList.toString());
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        //sort array
        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int total = nums[i]+nums[left]+nums[right];
                if(total==0){
                    result.add(nums[i]);
                    result.add(nums[left]);
                    result.add(nums[right]);
                    resultList.add(result);
                    result = new ArrayList<>();
                    left+=1;
                    right-=1;
                    while(left<right && nums[left]==nums[left-1]){
                        left+=1;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right-=1;
                    }
                }
                else if(total<0){
                    left+=1;
                }
                else{
                    right-=1;
                }
            }
        }
        return resultList;
    }
}
