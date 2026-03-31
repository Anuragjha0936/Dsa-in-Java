import java.util.*;

public class combination_sum_II {
    public static void main(String[] args) {
        int[] arr = {2,5,2,1,2};
        int target = 5;
        Arrays.sort(arr);
        ArrayList<Integer> p=new ArrayList<>();
        Set<List<Integer>>set=new HashSet<>();
//        func(arr,0,target,p,set);
        List<List<Integer>> list=new ArrayList<>();
        func(arr,0,target,p,list);
        System.out.println(list);
    }
//    static void func(int[] arr, int index, int val, ArrayList<Integer> p, Set<List<Integer>> set){
//        if(val==0){
//            set.add(new ArrayList<>(p));
//            return;
//        }
//        if(index>=arr.length){
//            return;
//        }
//        if(val>=arr[index]){
//            p.add(arr[index]);
//            func(arr,index+1,val-arr[index],p,set);
//            p.removeLast();
//        }
//        func(arr,index+1,val,p,set);
//    }
    static void func(int[] arr,int index,int val,ArrayList<Integer> p,List<List<Integer>> list){
        if(val==0){
            list.add(new ArrayList<>(p));
            return;
        }
        if(index==arr.length){
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > val) break;
            p.add(arr[i]);
            func(arr,i+1,val-arr[i],p,list);
           p.removeLast();
        }
    }
}
