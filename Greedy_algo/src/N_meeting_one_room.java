import java.util.Arrays;
import java.util.Comparator;

class duration{
    int s;
    int e;
    duration(int s,int e){
        this.e=e;
        this.s=s;
   }
}

public class N_meeting_one_room {
    public static void main(String[] args) {
        int[] start={1, 4, 6, 9};
        int[] end={2,5,7,12};
        int count=1;
        duration[] val=new duration[start.length];
        for(int i=0;i<val.length;i++){
            val[i]=new duration(start[i],end[i]);
        }
        Arrays.sort(val,(a,b)->a.e-b.e);
        int i=1;
        int j=0;
        while(i<val.length){
            if(val[i].s>val[j].e){
                count++;
                j=i;
            }
            i++;
        }
        System.out.println(count);
    }
}
