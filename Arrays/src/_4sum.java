
import java.util.*;

public class _4sum {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        Arrays.sort(arr);
        int target=0;
        List<List<Integer>> list1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                long newtar=(long)target-(arr[i]+arr[j]);
                int low=j+1;
                int high=arr.length-1;
                while(low<high){
                    if((long)(arr[low]+arr[high])==newtar){
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[low]);
                        list.add(arr[high]);
                        list1.add(list);

                        while(low<high && arr[low]==arr[low+1]){
                            low++;
                        }
                        while(low<high && arr[high]==arr[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    } else if (arr[low]+arr[high]<newtar) {
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }

        System.out.println(list1);
    }
}
