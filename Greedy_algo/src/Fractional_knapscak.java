import java.util.Arrays;
import java.util.Collections;

class Item{
    int value;
    int weight;
    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}
public class Fractional_knapscak {
    public static void main(String[] args) {
        int[] val={40,100,50,60};
        int[] wt={20,10,30,40};
        Item[] ratio=new Item[val.length];
        for(int i=0;i< ratio.length;i++){
            ratio[i]=new Item(val[i],wt[i]);
        }
        Arrays.sort(ratio,(a,b)-> Double.compare((double)b.value/b.weight,(double) a.value/a.weight));

        int profit=0;
        int capacity=60;
        for(int i=0;i< wt.length;i++){
            if(capacity==0){
                break;
            }
            if(ratio[i].weight<=capacity){
                profit+=ratio[i].value;
                capacity=capacity-ratio[i].weight;
            }else if(ratio[i].weight>capacity){
                profit+= (int) (((double)capacity/ratio[i].weight)*ratio[i].value);
            }
        }
        System.out.println(profit);

    }
}
