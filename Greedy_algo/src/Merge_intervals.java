import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_intervals {
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        int[] prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],arr[i][1]);
            }else{
                list.add(prev);
                prev=arr[i];
            }
        }
        list.add(prev);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
