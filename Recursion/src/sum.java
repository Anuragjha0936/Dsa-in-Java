public class sum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
        sum1(5,0);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    static void sum1(int n,int result){
        if(n==0){
            System.out.println(result);
            return;
        }
        sum1(n-1,result+n);
    }
}
