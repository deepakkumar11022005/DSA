package com.Service.Recursion;

public class Sudoku {
    public static void main(String[] args) {
        String arr[][]={{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        solve(arr);
    }

    private static boolean solve(String[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=="."){
                    for(char c='1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c))
                        {
                            board[i][j]= String.valueOf(c);
                        }
                        if(solve(board)==true) return true;
                        else board[i][j]= ".";
                    }
                }
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(String[][] board, int i, int j, int c) {
        for(int k=0;k<9;k++)
        {
            if(board[i][k]==String.valueOf(c))
                return false;
            if(board[k][j]==String.valueOf(c))
                return true;
            if(board[3*(i/3)+k/3][3*(j/3)+k%3]==String.valueOf(c))
                return false;
        }
        return true;
    }
}
