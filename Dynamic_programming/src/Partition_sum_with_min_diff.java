import java.util.ArrayList;

public class Partition_sum_with_min_diff {
    public static void main(String[] args) {
        int[] arr={3,9,7,3};
        int end_range=0;
        for(int i=0;i<arr.length;i++){
            end_range+=arr[i];
        }
        int target=end_range/2;
        boolean[][] dp=new boolean[arr.length+1][target+1];
        int r=0;
        for(int c=0;c<target+1;c++){
            dp[r][c]=false;
        }
        int k=0;
        for(int x=0;x<arr.length+1;x++){
            dp[x][k]=true;
        }

        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        ArrayList<Boolean> list=new ArrayList<>();
        for(int i=arr.length;i<arr.length+1;i++){
            for(int j=0;j<target+1;j++){
                list.add(dp[i][j]);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++) {
            if (list.get(i)) {
                int s1 = i;
                int result = end_range - 2 * s1;
                min = Math.min(result, min);
            }
        }
        System.out.println(min);
    }

}
