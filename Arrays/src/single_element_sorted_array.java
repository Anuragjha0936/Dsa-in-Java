import java.util.HashMap;

public class single_element_sorted_array {
    public static void main(String[] args) {
        int[] arr={1,1,2};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else{
//                map.put(arr[i],1);
//            }
//        }
//        for(int key:map.keySet()){
//            if(map.get(key)==1){
//                System.out.println(key);
//            }
//        }

//        optimal approach
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                if(mid!=0 && arr[mid]==arr[mid-1]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else{
                if(mid!=arr.length-1 && arr[mid]==arr[mid+1]){
                    low=mid+2;
                }else{
                    high=mid-1;
                }
            }
        }
        System.out.println(low);
    }
}
