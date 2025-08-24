public class Floor_ceil {
    public static void main(String[] args) {
        int[] arr={1, 5, 8, 12, 16};
        int target=7;
        int ans=0;
////        for floor
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<=target){
//                ans=arr[i];
//            }
//        }
//        System.out.println("The floor "+ans);
//        // for ceiling
//        for(int j=0;j< arr.length;j++){
//            if(arr[j]>=target){
//                System.out.println("The ceiling value "+arr[j]);
//                break;
//            }
//        }
        System.out.println(floor(arr,0,arr.length-1,7));
        System.out.println(ceiling(arr,0,arr.length-1,7));
    }
    public static int floor(int[] arr,int low,int high,int target){

//        for floor
        while (low <= high) {
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                low=mid+1;
                if(low<=arr.length-1 && arr[low]>target){
                   return arr[mid];

                }
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static int ceiling(int[] arr,int low,int high,int target){
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans!=0){
            return ans;
        }
        return -1;
    }
}
