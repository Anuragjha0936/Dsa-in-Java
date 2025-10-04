public class n_root_number {
    public static void main(String[] args) {
        int n=4;
        int m=69;
        double x=Math.pow(m,(double) 1/n);
       int low=1;
       int high=m;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(mid==x){
               System.out.println(mid);
               break;
           } else if (mid<x) {
               low=mid+1;
           }else{
               high=mid-1;
           }
       }

    }
}
