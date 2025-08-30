public class occurence {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,3};
        int low=0;
        int high=arr.length-1;
        int first_occur=-1;
        int last_occur=-1;
        int target=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                low=mid+1;
                last_occur=mid;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                high=mid-1;
                first_occur=mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        int count=(last_occur-first_occur)+1;
        System.out.println(count);
    }
}
