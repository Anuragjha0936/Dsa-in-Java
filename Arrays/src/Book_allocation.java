public class Book_allocation {

    public static void main(String[] args) {
        int[] arr={25, 46, 28, 49, 24};
        int m=4;
        int sum=0;
        int max=arr[0];
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        for(int j:arr){
            sum+=j;
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,m)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int[] arr,int mid,int m){
        int x=arr[0];
        int s=1;
        int i=1;
        while(i<arr.length){
            if(x+arr[i]<=mid){
                x+=arr[i];

            }else{
                x=arr[i];
                s++;
            }
            i++;
        }
        if(s<=m){
            return true;
        }else{
            return false;
        }
    }

}
