public class search_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target=0;
        int n=arr.length;
       int result=search(arr,n,target);
        System.out.println(result);
    }
    public static int search(int[] arr,int n,int target){
       int low=0;
       int high=n-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(arr[mid]==target){
               return mid;
           }
            // checking for the left sorted
//            checking if the target is lying on that sorted range
           if(arr[low]<=mid){
               if(arr[low]<=target && target<=arr[mid]){
                   high=mid-1;
               }else{
                   low=mid+1;
               }
           }

           if(arr[mid+1]<=arr[high]){
               if(arr[mid+1]<=target && target<=arr[high]){
                   low=mid+1;
               }else{
                   high=mid-1;
               }
           }

       }
       return -1;
    }
}
