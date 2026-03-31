
import java.util.*;
public class subset_1 {
    public static void main(String[] args) {
        int[] arr={5,2,1};
        ArrayList<Integer> p=new ArrayList<>();
        func(arr,0,0,p);
        System.out.println(p);
    }
    static void func(int[] arr,int index,int sum,ArrayList<Integer> p){
        if(index==arr.length){
            p.add(sum);
            return;
        }
        func(arr,index+1,sum+arr[index],p);
        func(arr,index+1,sum,p);
    }
}
