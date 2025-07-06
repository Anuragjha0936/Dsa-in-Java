public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=2;
//        //right rotate
//        reverse(arr,n-k,n-1);
//        reverse(arr,0,n-k-1);
//        reverse(arr,0,n-1);
//
        // left rotate
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void reverse(int[] arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }

    }


}
