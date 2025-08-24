public class max_prod_subarray {
    public static void main(String[] args) {
//        brute force approach
        int[] arr={-3,-1,-1};
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int product=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                product*=arr[j];
//                if(max<product){
//                    max=product;
//                }
//            }
//        }
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix*=arr[i];
            suffix*=arr[n-i-1];
            max=Math.max(max,(Math.max(prefix,suffix)));

        }

        System.out.println(max);
    }
}
