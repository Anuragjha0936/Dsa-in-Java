import java.util.*;

public class subseq_sum_k {
    public static void main(String[] args) {
        int[] arr={4,9,2,5,1};
        ArrayList<Integer> p=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        func(p,arr,0,0,list,10);
        System.out.println(list);
        System.out.println(list.size());
    }
    static void func(ArrayList<Integer> p,int[] u,int sum,int index,List<List<Integer>> list,int k){
        if(index==u.length){
            if(sum==k){
                list.add(new ArrayList<>(p)); // we should store the copy of p not the reference

            }
            return ;
        }
        p.add(u[index]);
        func(p,u,sum+u[index],index+1,list,k);
        p.removeLast();
        func(p,u,sum,index+1,list,k);
    }

}
