public class singlenumber {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        System.out.println( singleNumber(arr));
    }
    public static int singleNumber(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
            count=0;
        }
        return -2;
    }
}
