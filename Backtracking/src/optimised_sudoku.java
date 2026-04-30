public class optimised_sudoku {
    public static void main(String[] args) {
        char[][] board={
                {'5','3','.','6','7','8','9','.','2'},
                {'6','7','2','1','9','5','3','4','8'},
                {'.','9','8','3','4','2','5','6','7'},
                {'8','5','9','7','6','1','4','2','3'},
                {'4','2','6','8','5','3','7','9','1'},
                {'7','1','3','9','.','4','8','5','6'},
                {'9','6','.','5','3','7','2','8','4'},
                {'2','8','7','4','1','9','6','3','5'},
                {'3','4','5','2','8','6','1','7','9'}
        };
        solve(board);

    }
    static boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isSafe(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board)){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isSafe(char[][] board,int row,int col,char k){
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
