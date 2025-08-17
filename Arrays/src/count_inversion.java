import java.util.Arrays;

public class count_inversion {
    public static int divide(int[] arr, int si, int ei) {
        int count=0;
        if (si >= ei) {
            return count;
        }

        int mid = si + (ei - si)/ 2;
        count+=divide(arr, si, mid);
        count+=divide(arr, mid + 1, ei);
        count+=merge(arr, si, mid, ei);
       return count;
    }

    public static int merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int count=0;
        // Compare elements and merge into temp array
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                count+=mid-i+1;
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

        return count;

    }
    public static void main(String[] args) {
       int[] arr={2,3,7,1,3,5};
        System.out.println(divide(arr,0,arr.length-1));

    }
}
