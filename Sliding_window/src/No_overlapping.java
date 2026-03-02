import java.util.Arrays;

public class No_overlapping {
    public static void main(String[] args) {
        int[][] arr={{1,100},{11,22},{1,11},{2,12}};
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int count=0;
        int prevend=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<prevend){
                count++;
            }else{
                prevend=arr[i][1];
            }
        }
        System.out.println(count);
    }
}
