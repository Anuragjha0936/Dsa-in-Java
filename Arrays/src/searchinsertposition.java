
import java.util.Scanner;

public class searchinsertposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 3, 5, 6};
        int val=sc.nextInt();

        // this question state that
        // if the element found in the array return the index
        // otherwise return the index which it belongs
        // the array is sorted
        System.out.println(check(arr,val));
    }

    public static int check(int[] arr, int val) {

        int x=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==val){
                    return j;
                }
            }
            if(val > arr[i]){
                x=i+1;
            }
        }
        return x;
    }
}
