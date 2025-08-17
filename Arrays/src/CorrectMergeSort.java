import java.util.Arrays;

public class CorrectMergeSort {

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Compare elements and merge into temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left sub-array
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right sub-array
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }


    }

    public static void main(String[] args) {
        int[] arr={2,3,5,4,1};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}