import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class rat_maze {
    public static void main(String[] args) {
        int[][] maze={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        ArrayList<String> list=new ArrayList<>();
        func(maze,0,0,"",list);
        Collections.sort(list);
        System.out.println(list);
    }
    static void func(int[][] maze, int row, int col, String p, ArrayList<String> list){
        if(row==maze.length-1 && col==maze[0].length-1){
            list.add(p);
            return;
        }
        if(maze[row][col]==0){
            return;
        }

        int temp=maze[row][col];
        maze[row][col]=0;

//        right
        if(col<maze[0].length-1){
            func(maze,row,col+1,p+"R",list);
        }
        if(row<maze.length-1){
            func(maze,row+1,col,p+"D",list);
        }
        if(col>0){
            func(maze,row,col-1,p+"L",list);
        }
        if(row>0){
            func(maze,row-1,col,p+"U",list);
        }

        maze[row][col]=1;
    }
}
