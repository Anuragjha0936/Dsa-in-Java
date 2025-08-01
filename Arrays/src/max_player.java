public class max_player {
    public static void main(String[] args) {

        int[] players={4,2};
        int[] trainers={4,4,3};
        int i=0;
        int j=0;
        int count=0;
        mergeSort(players,0,players.length-1);
        mergeSort(trainers,0,trainers.length-1);
        while (i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(count);
    }
    public static void  merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int arr[], int l, int r){

        if (l < r) {


            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
