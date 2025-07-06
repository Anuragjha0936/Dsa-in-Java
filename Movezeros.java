import java.util.Arrays;

public class Movezeros {
    public static void main(String[] args) {
       // int[] arr={1,0,2,3,2,0,0,4,5,1};
        int[] arr={0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==0 && arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
