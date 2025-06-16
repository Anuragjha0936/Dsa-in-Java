import java.util.Arrays;

public class Countsort {
    public static void main(String[] args) {
        int[] arr={3,4,1,3,2,5,2,8};
        count(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void count(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[0];
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];

        for(int j=0;j<arr.length;j++){
            count[j]++;
        }
int index=0;
        for(int k=0;k<=max;k++){
            while(count[k]>0){
                arr[index]=k;
                index++;
                count[k]--;
            }
        }

    }
}
