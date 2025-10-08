public class making_bouqet {
    public static void main(String[] args) {
        int[] arr={7,7,7,7,12,7,7};
        int[] b=new int[arr.length];
        int m=2;
        int k=3;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        if(m*k<=arr.length){
            System.out.println(days(min,max,arr,m,k,b));
        }else{
        System.out.println(-1);
        }
    }
    public static int days(int low,int high,int[] arr,int m,int k,int[] b){
        int day=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int x=check(mid,arr,m,k,b);
            if(x==m){
                day=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return day;
    }
    public static int check(int day,int[] arr,int m,int k,int[] b){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
               b[i]=1;
            }else{
                b[i]=0;
            }
        }
        int count=0;
        int x=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==1){
                count++;

            }else{
                x+=count/k;
                count=0;
            }
        }
        x+=count/k;
        return x;
    }
}
