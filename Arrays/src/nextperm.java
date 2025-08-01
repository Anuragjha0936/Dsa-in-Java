

import java.util.Arrays;

public class nextperm {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        int n=arr.length-1;
        int index=-1;
        // to find the index where there id dip point
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        // now we will find the number that is largest but closest to the element
        // so we iterate the array from the last
        for(int i=n-1;i>=0;i--) {
            // we are checking the condition to avoid null pointer
            // because if the array contains the largest number [3,2,1]
            // there is no dip point so index remains -1
            if (index >= 0) {
                if (arr[index]<arr[i]){
                    int temp=arr[index];
                    arr[index]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }

        // now reverse the rest of array
        // reverse from the i+1 to the end
        int s=index+1;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
