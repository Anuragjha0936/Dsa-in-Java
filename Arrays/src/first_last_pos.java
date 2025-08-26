import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class first_last_pos {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=90;
       int[] arr1=new int[2];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                list.add(i);
//            }
//        }
//        for first occur
        int first_occur=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first_occur=mid;
                high=mid-1;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
//        for last_occur
        int last_occur=-1;
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last_occur=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        arr1[0]=first_occur;
        arr1[1]=last_occur;
        System.out.println(Arrays.toString(arr1));
    }
}
