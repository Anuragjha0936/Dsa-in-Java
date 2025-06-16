import java.util.Arrays;

public class mergeinplace {
    public static void divide(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,0,mid);
        divide(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int i=0;
        int j=mid+1;
        int[] b=new int[arr.length];
        int k=0;

        while(i<mid && j<ei){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
                k++;
            }else{
                b[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<mid){
            b[k]=arr[i];
            i++;
            k++;
        }
        while (j<ei) {
            b[k]=arr[j];
            k++;
            j++;
        }

       for(int l=0;l<b.length;l++){
           arr[si+l]=b[l];
       }

       // System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr={6,5,4,3,44,2};
        divide(arr,0,arr.length-1);
    }
}