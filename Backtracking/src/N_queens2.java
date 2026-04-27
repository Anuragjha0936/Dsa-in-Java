import java.util.Arrays;

public class N_queens2 {
    public static void main(String[] args) {
        int n=1;
        char[][] board=new char[n][n];

//        to fill the array
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        int result=func(board,0);
        System.out.println(result);
    }
    private static int func(char[][] board,int row){
        if(row== board.length){
            return 1;
        }
        int count=0;
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                count+=func(board,row+1);
                board[row][j]='X';
            }
        }
        return count;
    }

    private static boolean isSafe(char[][] board,int row,int col){
//        for row
        for(int j=0;j< board.length;j++){
            if(board[row][j]=='Q') return false;
        }
//        for col
        for(int i=0;i< board.length;i++){
            if(board[i][col]=='Q') return false;
        }

        int temp_row=row;
        int temp_col=col;
//        for north-west diagonal
        while(temp_row >=0 && temp_col >=0){
            if(board[temp_row][temp_col]=='Q') return false;
            temp_row--;
            temp_col--;
        }

        temp_row=row;
        temp_col=col;
//        North-east diagonal
        while(temp_row >=0 && temp_col <= board.length-1){
            if(board[temp_row][temp_col]=='Q') return false;
            temp_row--;
            temp_col++;
        }

        temp_row=row;
        temp_col=col;
//     South-west diagonal
        while(temp_row <= board.length-1 && temp_col >=0){
            if(board[temp_row][temp_col]=='Q') return false;
            temp_row++;
            temp_col--;
        }

        temp_row=row;
        temp_col=col;
//        south-east diagonal
        while(temp_row <= board.length-1 && temp_col<= board.length-1){
            if(board[temp_row][temp_col]=='Q') return false;
            temp_row++;
            temp_col++;
        }

        return true;
    }
}
