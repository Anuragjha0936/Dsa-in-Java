

import java.util.Arrays;
import java.util.HashSet;

public class longest_consecutive_subsequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        int length = 1;
        int max = 0;
        HashSet<Integer> set=new HashSet<>();
//        Arrays.sort(arr); // -> nlogn
//        for(int i=0;i<arr.length;i++){
//            int x=arr[i];
//            while(linearsearch(arr,x+1)){
//                x++;
//                length++;
//            }
//            if(max<length){
//                max=length;
//            }
//            length=1;
//        }
//            better approach
//        int i=0;
//        int j=i+1;
//        while(j<arr.length){
//            if(arr[j]==arr[i]+1){
//                length++;
//            }else{
//                length=1;
//            }
//            if(max<length){
//                max=length;
//            }
//            i++;
//            j++;
//        }
//        System.out.println(max);

        // optimal approach
        for (int j : arr) {
            set.add(j);
        }
        int i=0;
        while(i<arr.length) {
            if (!set.contains(arr[i] - 1)) {
                int x = arr[i];
                while (set.contains(x + 1)) {
                    x++;
                    length++;
                }
            }
            if(max<length){
                max=length;
            }
            length=1;
            i++;
        }
        System.out.println(max);

    }
//    public static boolean linearsearch(int[] arr,int x){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                return true;
//            }
//        }
//        return false;
//    }
}

