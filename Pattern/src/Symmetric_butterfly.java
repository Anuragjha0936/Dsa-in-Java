public class Symmetric_butterfly {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
//            lower left
            for(int j=1;j<=n;j++){
                if(j<=i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
//                for Lower Right part
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
//            Left part
            for(int j=n;j>=1;j--){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
//            right part
            for(int j=n-2;j>=n-i;j--){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
//
            System.out.println();
        }
    }
}
