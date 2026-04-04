import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_II {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        list.add(new ArrayList<>(p));
        Arrays.sort(arr);
        func(arr,0,p,list);
        System.out.println(list);
    }
    static void func(int[] arr, int index, ArrayList<Integer> p, List<List<Integer>> list){
        if(index==arr.length){
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            p.add(arr[i]);
            list.add(new ArrayList<>(p));
            func(arr,i+1,p,list);
            p.removeLast();
        }
    }
}
