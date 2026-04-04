public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int x=fact(n);
        System.out.println(x);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
