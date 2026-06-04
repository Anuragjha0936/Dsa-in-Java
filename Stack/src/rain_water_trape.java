public class rain_water_trape {
    public static void main(String[] args) {
        int[] arr={4,2,0,3,2,5};
//        int[] prefix=left_max(arr);
//        int[] suffix=right_max(arr);
        int total=0;
//        for(int i=0;i<arr.length;i++){
//            total+=Math.min(prefix[i],suffix[i])-arr[i];
//        }
        int left=0;
        int right=arr.length-1;
        int left_max=0;
        int right_max=0;
        while(left<right){
            if(arr[left]<arr[right]){
                left_max=Math.max(left_max,arr[left]);
                total+=left_max-arr[left];
                left++;
            }else{
                right_max=Math.max(right_max,arr[right]);
                total+=right_max-arr[right];
                right--;
            }
        }
        System.out.println(total);

    }
    /* there are two approaches to solve the question the first is by prefix max and suffix max */
//    the other one is two pointer approach//
    static int[] left_max(int[] arr){
        int[] prefix=new int[arr.length];
             int max=arr[0];
             for(int i=0;i<arr.length;i++){
                 if(arr[i]>max){
                     max=arr[i];

                 }
                 prefix[i]=max;
             }
             return prefix;
    }
    static int[] right_max(int[] arr){
        int[] suffix=new int[arr.length];
             int max=arr[arr.length-1];
             for(int i=arr.length-1;i>=0;i--){
                 if(max<arr[i]){
                     max=arr[i];
                 }
                 suffix[i]=max;
             }
             return suffix;
    }
}
