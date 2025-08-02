import java.util.ArrayList;
import java.util.HashMap;

public class max_subarray_sumk {
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int k=6;
        int ans=0;
       // Optimal approach time complexity-> O(n)
                HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum^=arr[i];
                if(map.containsKey(k^sum)){
                    ans+=map.get(k^sum);
                }
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else{
                    map.put(sum,1);
                }
            }

        System.out.println(ans);

//    better approach
//        int sum=0;
//        int count=0;
//
//        for(int i=0;i<arr.length;i++){
//
//            for(int j=i;j<arr.length;j++){
//                sum^=arr[j];
//                if(sum==k){
//                    count++;
//                }
//
//            }
//            sum=0;
//        }
//        System.out.println(count);
    }
    }

