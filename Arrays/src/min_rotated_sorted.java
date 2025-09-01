public class min_rotated_sorted {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int x=minsearch(arr);
        System.out.println(arr[x]);
    }
    public static int minsearch(int[] arr){
        int low=0;
        int high=arr.length-1;
        int first=arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=first){
                ans=mid;
                high=mid-1;

            }else if(arr[mid]>first){
                low=mid+1;
            }
        }
        return Math.min(ans, first);
    }
}
