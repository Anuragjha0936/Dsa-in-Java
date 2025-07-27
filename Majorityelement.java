package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Majorityelement {
    public static void main(String[] args) {
        int[] arr={1,2};
//        HashSet<Integer> set=new HashSet<>();
//        // brute force approach
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count>arr.length/3){
//                set.add(arr[i]);
//            }
//            count=0;
//        }
//        ArrayList<Integer> list=new ArrayList<>(set);
//        System.out.println(list);
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int n=arr.length;
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                list.add(key);
            }
        }
        System.out.println(list);
    }

   
}
