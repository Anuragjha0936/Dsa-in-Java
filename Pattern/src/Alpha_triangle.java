public class Alpha_triangle {
    public static void main(String[] args) {
        int n=5;
        int ch='E';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(ch)+" ");
                ch++;
            }
            ch=ch-i-1;
            System.out.println();
        }
    }
}
