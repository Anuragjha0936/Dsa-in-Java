public class container_most_water {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int total=0;
        int max=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                total=Math.min(arr[i],arr[j])*(j-i);
//                if(max<total){
//                    max=total;
//                }
//            }
//        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]<=arr[right]){
                total=arr[left]*(right-left);
                max=Math.max(max,total);
                left++;
            }
            else{
                total=arr[right]*(right-left);
                max=Math.max(max,total);
                right--;
            }
        }
        System.out.println(max);
    }
}
