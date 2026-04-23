import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr={1,1,3};
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        boolean[] visit=new boolean[arr.length];
        func(arr,p,list,visit);
        System.out.println(list);
    }
    static void func(int[] arr, ArrayList<Integer> p,  List<List<Integer>> list,boolean[] visit){
        if(p.size()==arr.length){
            list.add(new ArrayList<>(p));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!visit[i]){
                p.add(arr[i]);
                visit[i]=true;
                func(arr,p,list,visit);
                p.removeLast();
                visit[i]=false;
            }
        }
    }
}
