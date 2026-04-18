import java.util.ArrayList;
import java.util.List;

public class all_direction_maze {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        func("",0,0,list,maze);
        System.out.println(list);
    }
    static void func(String p, int row, int col, List<String> list,boolean[][] maze){
       if(row==maze.length-1 && col==maze[0].length-1){
           list.add(p);
           return;
       }
       if(!maze[row][col]){
           return;
       }
       maze[row][col]=false;

       if(col<maze[0].length-1){
           func(p+"R",row,col+1,list,maze);
       }
       if(row<maze.length-1){
           func(p+"D",row+1,col,list,maze);
       }
       if(col>0){
           func(p+"L",row,col-1,list,maze);
       }
       if(row>0){
           func(p+"U",row-1,col,list,maze);
       }

       maze[row][col]=true;
    }
}
