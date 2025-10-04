public class search_insert_position {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};

        int x=search(arr,0,arr.length-1,2
        );
        System.out.println(x);
    }
    public static int search(int[] arr,int low,int high,int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
                if(low<=arr.length-1&&arr[low]>target){
                    return low;
                }
            }else{
                high=mid-1;
                if(high>=arr.length-1&&arr[high]<target){
                    return high+1;
                }
            }
        }
       if(target<arr[0]){
           return 0;
       }else if(target>arr[arr.length-1]){
           return arr.length;
       }
       return -1;
    }
}
