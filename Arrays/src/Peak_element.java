public class Peak_element {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
//        for(int i=0;i<arr.length;i++){
//            if(i==0) {
//                if (arr[i] > arr[i + 1]) {
//                    System.out.println(i);
//                    break;
//                }
//            }else if (i==arr.length-1) {
//                    if(arr[i]>arr[i-1]){
//                        System.out.println(i);
//                        break;
//                    }
//                }else if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
//                    System.out.println(i);
//                    break;
//                }
//
//        }

//        optimise approach
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.println(mid);
                break;
            }else if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
    }
}
