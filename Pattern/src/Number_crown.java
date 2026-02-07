public class Number_crown {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
//            for left part
            for(int j=1;j<=n;j++){
                if(j<=i) {
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
//                for Right part
                for(int j=1;j<=n;j++){
                    if(j<=n-i){
                        System.out.print(" ");
                    }
            }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
            System.out.println();
        }
    }
}
