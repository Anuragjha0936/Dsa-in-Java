import java.util.*;

public class combiantion_sum_III {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=3;
        int val=9;
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        func(arr,0,val,p,list,k);
        System.out.println(list);

    }
    static void func(int[] arr,int index,int val,ArrayList<Integer> p,List<List<Integer>> list,int k){
        if(val==0){
            if(p.size()==k){
                list.add(new ArrayList<>(p));
            }
            return;
        }
        if(index==arr.length){
            return;
        }
        if(val>=arr[index]){
            p.add(arr[index]);
            func(arr,index+1,val-arr[index],p,list,k);
            p.removeLast();
        }
        func(arr,index+1,val,p,list,k);
    }
}
