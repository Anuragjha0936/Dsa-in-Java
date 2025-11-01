import java.util.Arrays;
public class Agressive_cow {
    public static void main(String[] args) {
        int[] arr={4, 2, 1, 3, 6};
        int k=2;
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,k-1)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(high);

    }
    public static boolean check(int[] arr,int mid,int k){
        int i=1;
        int x=arr[0];
        while(i<arr.length){
            if(arr[i]-x>=mid){
                k--;
                x=arr[i];
            }
            i++;
        }
        if(k==0){
            return true;
        }else{
            return false;
        }
    }
}
