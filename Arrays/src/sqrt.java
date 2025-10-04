public class sqrt {
    public static void main(String[] args) {
        int n=121;
//        Brute force approach
        int ans=1;
//        for(int i=1;i<=n;i++){
//            if(i*i<=n){
//                ans=i;
//            }else{
//                break;
//            }
//        }
//        optimised approach
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid*mid)<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
