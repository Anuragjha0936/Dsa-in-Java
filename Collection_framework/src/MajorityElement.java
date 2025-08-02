import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,1,1,3};
        int n=arr.length;
        major(arr,n);
    }
    public static void major(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                System.out.println(key);
            }
        }
    }
}
