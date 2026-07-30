import java.util.ArrayList;
import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String t="abcde";
        String y="ace";
//        int[][] dp=new int[t.length()+1][y.length()+1];
//        for(int[] row:dp){
//            Arrays.fill(row,-1);
//        }
//        System.out.println(func(t,y,dp,t.length()-1,y.length()-1));
        System.out.println(func1(t,y));
    }
//    Memoization

//    static int func(String t,String y,int[][] dp,int n,int m){
//        if(t.length()==0 || y.length()==0){
//            return 0;
//        }
//        if(dp[n][m]!=-1){
//            return dp[n][m];
//        }
//        if(t.charAt(t.length()-1)!=y.charAt(y.length()-1)){
//            return dp[n][m]=Math.max(func(t.substring(0,t.length()-1),y,dp,n-1,m),func(t,y.substring(0,y.length()-1),dp,n,m-1));
//        }
//        return dp[n][m]=func(t.substring(0,t.length()-1),y.substring(0,y.length()-1),dp,n-1,m-1)+1;
//    }

//    Tabulation
    static int func1(String text1,String text2){
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
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

