public class checkarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,6};
        System.out.println(Check(arr));
    }
    public static boolean Check(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
