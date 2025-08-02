import java.util.HashMap;
import java.util.HashSet;

public class twosum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] brr=new int[2];
        int target=14;

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                brr[0]=arr[i];
                brr[1]=target-arr[i];

            }
            else{
                map.put(arr[i],i);
            }
        }

    }
}
