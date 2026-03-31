import java.lang.reflect.Array;
import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        ArrayList<Integer> p=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        func(arr,0,target,p,list);
        System.out.println(list);
    }
    static void func(int[] arr,int index,int val,ArrayList<Integer> p,List<List<Integer>> list){
        if(val==0){
            list.add(new ArrayList<>(p));
            return;
        }
        if(index==arr.length){
            return;
        }
        if(val>=arr[index]){
            p.add(arr[index]);
            func(arr,index,val-arr[index],p,list);
            p.removeLast();
        }
        func(arr,index+1,val,p,list);
    }
}
