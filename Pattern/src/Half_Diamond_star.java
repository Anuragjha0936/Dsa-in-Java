public class Half_Diamond_star {
    public static void main(String[] args) {
        int n1=5;
        int n2=4;
//        upper half
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        Lower Half
        for(int i=1;i<=n2;i++){
            for(int j=n2;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
