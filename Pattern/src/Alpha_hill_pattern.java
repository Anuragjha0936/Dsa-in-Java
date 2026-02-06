public class Alpha_hill_pattern {
    public static void main(String[] args) {
        int n=4;
        int ch='A';
        int temp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j>=n-i+1 && j<=n+i-1){
                   if(j<=(2*n+1)/2){
                       System.out.print((char)(ch));
                       temp=ch;
                       ch++;
                   }else{
                       temp--;
                       System.out.print((char)(temp));
                   }
                }else {
                    System.out.print(" ");
                }
            }
            ch='A';
            System.out.println();
        }
    }
}
