public class Print_LCS {
    public static void main(String[] args) {
        String text1="abcde";
        String text2="ace";
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        func1(text1,text2,dp);
        int i=n;
        int j=m;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(text1.charAt(i-1)!=text2.charAt(j-1)){
                if(dp[i][j-1]>=dp[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }else{
                sb.append(text1.charAt(i-1));
                i--;
                j--;
            }
        }
        System.out.println(sb.reverse());
    }
    static int func1(String text1,String text2,int[][] dp){
        int n=text1.length();
        int m=text2.length();

        int r=0;
        for(int j=0;j<m+1;j++){
            dp[r][j]=0;
        }
        int c=0;
        for(int i=0;i<n+1;i++){
            dp[i][c]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1)!=text2.charAt(j-1)){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                else{
                    dp[i][j]=dp[i-1][j-1]+1;

                }
            }
        }

        return dp[text1.length()][text2.length()];

    }
}
