package com.venkatscode.dsa.pps50;

public class PPS9IsValidPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindromeUpdated("A man, a plan, a canal: Panama");
        System.out.println(result);
    }

    public static boolean isPalindromeUpdated(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!valid(s.charAt(i))) {
                i++;
                continue;
            }

            if (!valid(s.charAt(j))) {
                j--;
                continue;
            }

            if (modify(s.charAt(i)) != modify(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int modify(int ch) {
        if (ch >= 65 && ch <= 90) {
            return ch + 32;
        }
        return ch;
    }

    private static boolean valid(int ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }

    private static boolean isValidPalindrome(String s) {
        String slower = s.toLowerCase();
        String newStr = "";
        for(char c: slower.toCharArray()){
            if ((c >= 'a' && c<= 'z') || (c>='0' && c<='9')){
                newStr=newStr+c;
            }
        }
        for(int i=0;i<newStr.length();i++){
            if(newStr.charAt(i)!=newStr.charAt(newStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
