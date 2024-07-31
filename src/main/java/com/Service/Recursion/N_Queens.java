package com.Service.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        int n=4;
        List<List<String>> res= solve(n);
        for(List<String> i:res)
            for(String j:i)
                System.out.println(j);

    }

    private static List<List<String>> solve(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        List<List<String>> res=new ArrayList<>();
        int leftRow[]=new int[n];
        int leftDiagonal[]=new int[2*n-1];
        int rightDiagonal[]=new int[2*n-1];
        solveQueen(0,res,leftDiagonal,rightDiagonal,leftRow,board,n);
        return res;
    }

    private static void solveQueen(int col, List<List<String>> res, int[] leftDiagonal, int[] rightDiagonal, int[] leftRow,char [][]board, int n) {
        if(col==n)
        {
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++)
        {
           if(leftRow[row]==0 && leftDiagonal[row+col]==0 && rightDiagonal[board.length-1 +col-row]==0 ){
               board[row][col]='Q';
               leftRow[row]=1;
               leftDiagonal[row+col]=1;
               rightDiagonal[board.length-1 +col-row]=1;
               solveQueen(col+1,res,leftDiagonal,rightDiagonal,leftRow,board,n);
               board[row][col]='.';
               leftRow[row]=0;
               leftDiagonal[row+col]=0;
               rightDiagonal[board.length-1 +col-row]=0;

           }

        }
    }

    private static List<String> construct(char[][] board) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            l.add(s);
        }
        return l;
    }
}
