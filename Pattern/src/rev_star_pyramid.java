public class rev_star_pyramid {
    public static void main(String[] args) {
        int n=5;
//        we use this both loop when we want  to make a structure from both the star pyramid and the
//        reverse pyramid
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=2*n-1;j++){
//                if(j>=n-i+1 && j<=n+i-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j>=i && j<=2*n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
