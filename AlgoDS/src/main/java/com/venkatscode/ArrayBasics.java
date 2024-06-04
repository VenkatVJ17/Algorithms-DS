package com.venkatscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBasics {

    public static void main(String[] args) {

        ArrayList<Integer> result = mergeTwoIntArraysUpdated(new ArrayList<Integer>(List.of(-1,3)),new ArrayList<Integer>(List.of(-1,-1,0,0,1,2)));
        //removeEven(new int[]{1, 2, 3, 4});
    }

    private static ArrayList<Integer> mergeTwoIntArraysUpdated(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;


        while(p1<a.size() && p2<b.size()){
            if(a.get(p1)<b.get(p2)){
                result.add(a.get(p1));
                p1++;
            }else{
                result.add(b.get(p2));
                p2++;
            }
        }
        while(p1<a.size()){

                result.add(a.get(p1));
                p1++;

        }
        while( p2<b.size()){

                result.add(b.get(p2));
                p2++;
        }

        return result;
    }
    private static ArrayList<Integer> mergeTwoIntArrays(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>(a.size()+b.size());
        int p1 = 0;
        int p2 = 0;
        Integer v1=0,v2=0;
        boolean aArrayFull = false;
        boolean bArrayFull = false;
        for(int p3=0;p3<(a.size()+b.size());p3++){
            if(p1<a.size()){
                 v1 = a.get(p1);

            }else{
               aArrayFull = true;
            }
            if(p2<b.size()){
                v2 = b.get(p2);

            }else {
                bArrayFull = true;
            }

            if(v1<v2 && !aArrayFull){
                result.add(v1);
                p1++;
            }else if(aArrayFull){
                result.add(v2);
                p2++;
            }else if(bArrayFull){
                result.add(v1);
                p1++;
            }else{
                result.add(v2);
                p2++;
            }
        }
        return result;
    }





    private static int[] removeEven(int[] ints) {
        return Arrays.stream(ints)
                .filter(x -> x%2 !=0)
                .toArray();
    }
}
