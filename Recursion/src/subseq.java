import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subseq {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        sub_set(p,arr,0,list);
        System.out.println(list);
    }
    static void sub_set(ArrayList<Integer> p,int[] u,int index,List<List<Integer>> list){
        if(index==u.length){
            list.add(new ArrayList<>(p));
            return;
        }
        p.add(u[index]);
       sub_set(p,u,index+1,list);
       p.removeLast();
       sub_set(p,u,index+1,list);
    }
}
