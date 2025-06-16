import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] arr={1,2,1,4,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr){
        boolean flag;
        for(int i=0;i<arr.length;i++){
            flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
