public class test {
    public static void main(String[] args) {
        int n=12345;
        int pow=1;
        while(n!=0){
            n=n/10;
            pow*=10;
        }
        pow=pow/10;
        while(n!=0){
            System.out.println(n/pow);
            n=n%pow;
            pow=pow/10;
        }
    }
}
