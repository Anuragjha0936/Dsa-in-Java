public class Rotate_a_num {
    public static void main(String[] args) {
        int n=12345;
        int r=2;
        int pow=(int)(Math.pow(10.0,r));
       int right=n%pow;
       int left=n/pow;
       int count=0;
       while(n!=0){
           count++;
           n=n/10;
       }


    }
}
