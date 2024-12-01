package com.venkatscode.dsa.pps50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PPS4GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> listofString = groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        System.out.println(listofString);
    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        HashMap<String,List<String>> lsMap = new HashMap<>();
        //sort each word and append to  strings
        for(String str:strings){
            String sortedString = sortString(str);
            lsMap.computeIfAbsent(sortedString,key->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(lsMap.values());
    }

    private static String sortString(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
