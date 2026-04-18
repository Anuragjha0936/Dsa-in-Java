import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class path_matrix_maze {
    public static void main(String[] args) {
        int[][] maze={
                {0,0,0},{0,0,0},{0,0,0}
        };
        List<String> list=new ArrayList<>();
        func("",0,0,list,maze,1);
        System.out.println(list);
    }
    static void func(String p,int row,int col,List<String> list,int[][] maze,int i){
        if(row==maze.length-1 && col==maze[0].length-1){
            maze[row][col]=i;
            System.out.println(Arrays.deepToString(maze));
            list.add(p);
            return;
        }
        if(maze[row][col]!=0){
            return;
        }
        maze[row][col]=i;
        if(col<maze[0].length-1){
            func(p+"R",row,col+1,list,maze,i+1);
        }
        if(row<maze.length-1){
            func(p+"D",row+1,col,list,maze,i+1);
        }
        if(col>0){
            func(p+"L",row,col-1,list,maze,i+1);
        }
        if(row>0){
            func(p+"U",row-1,col,list,maze,i+1);
        }

        maze[row][col]=0;
    }
}
