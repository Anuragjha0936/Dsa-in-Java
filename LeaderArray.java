package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderArray {
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> list=new ArrayList<>();

        // brute force
//
//        for(int i=0;i<arr.length;i++){
//            int j=i+1;
//            while(j<arr.length){
//                if(arr[i]<arr[j]){
//                    break;
//                }else{
//                    j++;
//                    if(j==arr.length){
//                        list.add(arr[i]);
//                    }
//                }
//            }
//
//        }
//        list.add(arr[arr.length-1]);
//        System.out.println(list);

        // optimal

        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max(arr, i + 1, arr.length - 1)) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
    public static int max(int[] arr,int s,int e){
        int max=0;
        for(int i=s;i<=e;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
