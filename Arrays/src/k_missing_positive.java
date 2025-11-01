public class k_missing_positive {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=2;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(high+1+k);
    }
}
