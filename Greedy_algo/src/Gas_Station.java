import java.util.Arrays;

public class Gas_Station {
    public static void main(String[] args) {
        int[] gas = {5,8,2,8};
        int[] cost = {6,5,6,6};
        int total_gas=0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_gas<total_cost){
            System.out.println(-1);
        }
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        System.out.println(start);
    }
}
