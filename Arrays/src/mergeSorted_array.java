import java.util.Arrays;

public class mergeSorted_array {
    public static void main(String[] args) {
        int[] arr1={4,0,0,0,0,0};
        int[] arr2={1,2,3,5,6};

//        Brute force approach
//        Arrays.sort(arr1);
//        int n=arr2.length;
//        int i=0;
//        int j=0;
//        while(j<n){
//            if(arr2[j]!=0 && arr1[i]==0) {
//                arr1[i]=arr2[j];
//            }
//            i++;
//            j++;
//        }
//
//        Arrays.sort(arr1);
//
        int n=arr2.length;
        int m=arr1.length-n;
        int y=arr1.length;
        int k=y-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                k--;
                i--;
            }else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }

        }
        while(j>=0){
            arr1[k]=arr2[j];
            k--;
            j--;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
