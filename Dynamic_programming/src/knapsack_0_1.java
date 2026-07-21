import java.util.Arrays;

public class knapsack_0_1 {
    static int[][] dp=new int[4][8];
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int capacity=7;
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int profit=knapsack(wt,val,capacity,val.length-1);
        System.out.println(profit);
    }
//    Recursive Approach
    static int knapsack(int[] wt,int[] val,int capacity,int i){
        if(i<0 || capacity==0){
            return 0;
        }
        if(dp[i][capacity]!=-1){
            return dp[i][capacity];
        }
        if(wt[i]<=capacity){
            int include=val[i]+knapsack(wt,val,capacity-wt[i],i-1);
            int not_inc=knapsack(wt,val,capacity,i-1);
            return dp[i][capacity]=Math.max(include,not_inc);
        }
        return dp[i][capacity]=knapsack(wt,val,capacity,i-1);
    }
}
