public class how_many_times_array_rotated {
    public static void main(String[] args) {
        int[] arr={4, 5, 1, 2};

        System.out.println(search_in_rotated_array(arr));

    }
    public static int search_in_rotated_array(int[] arr){
        int low=0;
        int high=arr.length-1;
        int first=arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<first){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
