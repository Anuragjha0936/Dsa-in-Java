
import java.util.*;
public class print_path_maze {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
//        func("",3,3,list);
//        System.out.println(list);
        func1("",3,3,list);
        System.out.println(list);
    }
//    static void func(String p,int row,int col,List<String> list){
//        if(row ==1 && col ==1){
//            list.add(p);
//            return;
//        }
//        if(col>1){
//            func(p+"R",row,col-1,list);
//        }
//        if(row>1){
//            func(p+"D",row-1,col,list);
//        }
//    }
//    allowing also the diagonal moves
    static void func1(String p,int row,int col,List<String> list){
        if(row==1 && col==1){
            list.add(p);
            return;
        }
//        Right
        if(col>1){
            func1(p+"R",row,col-1,list);
        }
//        Diagonal
        if(row>1 && col>1){
            func1(p+"d",row-1,col-1,list);
        }
//        Down
        if(row>1){
            func1(p+"D",row-1,col,list);
        }
    }
}
