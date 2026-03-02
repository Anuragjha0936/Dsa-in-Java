import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class job_sequencing {
    public static void main(String[] args) {
        int[] profit={20,10,40,30};
        int[] deadline={4,1,1,1};
        prof[] arr=new prof[profit.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=new prof(profit[i],deadline[i]);
        }
        Arrays.sort(arr,(a, b)->b.prft-a.prft);
        int maxdl=0;
        for(int i=0;i<deadline.length;i++){
            maxdl=Math.max(maxdl,deadline[i]);
        }
        boolean[] slot=new boolean[maxdl+1];
        int total_profit=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
//            Now check for the free slot
            for(int j=arr[i].dl;j>=1;j--){
                if(!slot[j]){
                    slot[j]=true;
                    total_profit+=arr[i].prft;
                    count++;
                    break;
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(count);
        list.add(total_profit);
        System.out.println(list);
    }
}
class prof{
    int prft;
    int dl;
    prof(int prft,int dl){
        this.prft=prft;
        this.dl=dl;
    }
}
