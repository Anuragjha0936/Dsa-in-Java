import java.util.Arrays;

public class Mergesort {

    public static int[] divide(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=divide(Arrays.copyOfRange(arr,0,mid));
        int[] right=divide(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;

        int[] m=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                m[k]=left[i];
                k++;
                i++;
            }else{
                m[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            m[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            m[k]=right[j];
            j++;
            k++;
        }
        return m;
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
          arr=divide(arr);

        System.out.println(Arrays.toString(arr));
    }
}

