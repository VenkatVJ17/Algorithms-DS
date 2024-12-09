package com.venkatscode.dsa.pps50;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PPS5TopKElements {
    public static void main(String[] args) {
        int[] result = findTopKElements(new int[]{1,1,1,2,2,3},2);
        System.out.println(result);
    }

    private static int[] findTopKElements(int[] nums, int k) {
        //Find occurence (nbr,cnt)
        HashMap<Integer,Integer> hmp = new HashMap<>();
        for(int nbr: nums) {
            hmp.put(nbr, hmp.getOrDefault(nbr, 0) + 1);
        }

        List<Integer> topKElements = hmp.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return topKElements.stream().mapToInt(Integer::intValue).toArray();
        //Sort based on occurance
    }
}
