public class Koko_eating_banana {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        int h = 1000000000;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }

        int low = 1;
        int high = max;

        int ans=-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
             long sum = check(arr, mid);
            if (sum <= h) {
                ans=mid;
                high = mid - 1;


            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);

    }
    public static long check(int[] arr,int mid){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= (long) Math.ceil((double) arr[i] /mid);
        }
        return sum;
    }
}
