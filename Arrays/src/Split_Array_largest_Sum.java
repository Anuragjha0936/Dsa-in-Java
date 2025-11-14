public class Split_Array_largest_Sum {
    public static void main(String[] args) {
        int[] arr={1,4,4};
        int k=3;
        int max=0;
        int sum=0;
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        for(int i:arr){
            sum+=i;
        }
        int ans=-1;
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int[] arr,int mid,int k){
        int i=1;
        int count=1;
        int x=arr[0];
        while(i<arr.length){
            if(x+arr[i]<=mid){
                x+=arr[i];
            }else{
                count++;
                x=arr[i];
            }
            i++;
        }
       if(count<=k){
           return true;
       }else{
           return false;
       }
    }
}
