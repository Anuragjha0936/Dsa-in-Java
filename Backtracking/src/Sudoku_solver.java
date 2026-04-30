import java.util.Arrays;

public class Sudoku_solver {
    public static void main(String[] args) {
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        func(board,0,0);


    }
    static void func(char[][] board,int row,int col) {
        if(row==board.length){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j] +" ");
                }
                System.out.println();
            }
            return;
        }
        if(board[row][col]!='.'){
           if(col<8) func(board,row,col+1);
           else func(board,row+1,0);
        }
        else{
            for(char ch='1';ch<='9';ch++){
                if(isSafe(board,row,col,ch)){
                    board[row][col]=ch;
                    if(col<8) func(board,row,col+1);
                    else func(board,row+1,0);
                    board[row][col]='.';
                }
            }
        }
    }
    static boolean isSafe(char[][] board,int row,int col,int k){
//        row
        for(int j=0;j<board.length;j++){
            if(board[row][j]==k){
                return false;
            }
        }
//        column
        for(int i=0;i<board.length;i++){
            if(board[i][col]==k){
                return false;
            }
        }
//        for 3X3 grid
        int sRow=row/3*3;
        int sCol=col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==k){
                    return false;
                }
            }
        }
        return true;
    }
}
