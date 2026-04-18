import java.util.*;

public class obstacle_maze {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,false},
                {true,false,true},
                {true,true,true}
        };
        List<String> list=new ArrayList<>();
        func("",maze,0,0,list);
        System.out.println(list);
    }
    static void func(String p,boolean[][] maze,int row,int col,List<String> list){
        if(row==maze.length-1 && col==maze[0].length-1){
            list.add(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(col<maze[0].length-1){
            func(p+"R",maze,row,col+1,list);
        }
        if(row<maze.length-1){
            func(p+"D",maze,row+1,col,list);
        }
    }
}
