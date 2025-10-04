public class search_sort_rotated_2 {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1};
        int low=0;
        int high=arr.length-1;
        System.out.println(search(arr,low,high));
    }
    public static boolean search(int[] arr,int low,int high){
        int target=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
