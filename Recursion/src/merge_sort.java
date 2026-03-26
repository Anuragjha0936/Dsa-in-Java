import java.util.ArrayList;
import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<mid+1 && j<=high){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
               temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<mid+1){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high){
            temp[k]=arr[j];
            k++;
            j++;
        }

        for(int l=0;l<temp.length;l++){
            arr[low+l]=temp[l];
        }
    }
}
