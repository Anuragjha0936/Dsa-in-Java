package Arrays;

public class longestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        System.out.println( "Longest Subarray"+ " "+longest(arr,3));

    }

    public static int longest(int[] arr,int k){
        int length=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               sum+=arr[j];
               if(sum==k){
                   if(length<=j-i+1){
                       length=j-i+1;
                   }
               }
            }
            sum=0;
        }
        return length;
    }
}
