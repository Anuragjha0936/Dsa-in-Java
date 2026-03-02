import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_interval {
    public static void main(String[] args) {
        int[][] arr={{1,3},{4,5},{6,7},{8,10}};
        int[] target ={5,6};
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target[0]>arr[mid][0]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        int[][] res=new int[arr.length+1][2];
        for(int i=0;i<low;i++){
            res[i]=arr[i];
        }
        res[low]=target;
        for(int i=low;i< arr.length;i++){
            res[i+1]=arr[i];
        }
        int[] prev=res[0];
        List<int[]> list=new ArrayList<>();
        for(int k=1;k<res.length;k++){
            if(prev[1]>=res[k][0]){
                prev[1]=Math.max(prev[1],res[k][1]);
            }else{
                list.add(prev);
                prev=res[k];
            }
        }
        list.add(prev);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
