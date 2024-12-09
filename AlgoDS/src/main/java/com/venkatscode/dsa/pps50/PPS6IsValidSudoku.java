package com.venkatscode.dsa.pps50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PPS6IsValidSudoku {
    public static boolean isValid(char[][] board, int row,int col,int num){
        //row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }

    public static boolean isValidSudokuUpdated(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                char num = board[i][j];
                board[i][j] = '.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j] = num;
            }

        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board) {
        ArrayList<Integer> rowList = new ArrayList<Integer>();
        ArrayList<Integer> colList = new ArrayList<Integer>();
        //Get rows
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board.length-1;j++){
                if(board[i][j]!='.'){
                    rowList.add(Integer.parseInt((board[i][j])+""));
                }
            }
            HashSet<Integer> rowHset = new HashSet<>();
            for(Integer row:rowList){
                if(!rowHset.add(row)){
                    return false;
                }
            }
            rowList = new ArrayList<>();
        }
        //Get columns
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board.length-1;j++){
                if(board[j][i]!='.'){
                    colList.add(Integer.parseInt((board[j][i])+""));
                }
            }
            HashSet<Integer> colHset = new HashSet<>();
            for(Integer col:colList){
                if(!colHset.add(col)){
                    return false;
                }
            }
            colList = new ArrayList<>();

        }
        //Get 3x3 matrix
        for(int row=0;row<board.length;row+=3) {
            for (int col = 0; col < board.length; col+=3) {
                List<Integer> submatrixList = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[row + i][col + j] != '.') {
                            submatrixList.add(Integer.parseInt((board[row + i][col + j]) + ""));
                        }
                    }
                }
                HashSet<Integer> subMset = new HashSet<>();
                for(Integer sub:submatrixList){
                    if(!subMset.add(sub)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isValidSudokuUpdated(new char[][]{
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        });

        System.out.println(result);


    }
}
