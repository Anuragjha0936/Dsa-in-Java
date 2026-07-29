public class count {
    public static void main(String[] args) {
        int totalSum=0;
        int diff=3;
        int[] arr={5,2,6,4};
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        if((totalSum+diff)%2!=0 || totalSum<diff){
            System.out.println(0);
        }
        int target=(totalSum+diff)/2;
        int[][] dp=new int[arr.length+1][target+1];

        int r=0;
        for(int c=0;c<target+1;c++){
            dp[r][c]=0;
        }
        int k=0;
        for(int x=0;x<arr.length+1;x++){
            dp[x][k]=1;
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[arr.length][target]);
    }
}
