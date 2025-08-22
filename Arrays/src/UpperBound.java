public class UpperBound {
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        int x=2;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>x){
//                System.out.println(i);
//                break;
//            }
//        }

        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
