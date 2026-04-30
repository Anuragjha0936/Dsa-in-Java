public class valid_sudoku {
    public static void main(String[] args) {
        char[][] board={
                {'.','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    if(!isValid(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    static boolean isValid(char[][] board,int row,int col,char k){
        // for row
        for(int j=0;j<board.length;j++){
            if(j!=col &&board[row][j]==k){
                return false;
            }
        }
        // column
        for(int i=0;i<board.length;i++){
            if(i!=row && board[i][col]==k){
                return false;
            }
        }

        int sRow=row/3*3;
        int sCol=col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(i==row && j==col) continue;
                if(board[i][j]==k){
                    return false;
                }
            }
        }
        return true;
    }
}
