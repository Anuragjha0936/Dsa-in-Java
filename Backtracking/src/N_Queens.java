import java.util.Arrays;

public class N_Queens {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];

//        to fill the array
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        func(board,0);
    }
    private static void func(char[][] board,int row){
        if(row== board.length){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
                }
            System.out.println();
            return;
            }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                func(board,row+1);
                board[row][j]='X';
            }
        }
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

        return true;
    }
}
