import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr={3,5,8,15,19};
        Scanner sc=new Scanner(System.in);
        int x=9;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>=x){
//                System.out.println(i);
//                break;
//            }
//        }
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]>=x){
                high=high-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
