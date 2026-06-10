import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class slinding_window_max {
    public static void main(String[] args) {
//        int[] arr={1,3,-1,-3,5,3,6,7};
//        int max;
//        int k=3;
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<arr.length-k+1;i++){
//            max=arr[i];
//            for(int j=i;j<i+k;j++){
//                max=Math.max(arr[j],max);
//            }
//            list.add(max);
//        }
//
//
//        System.out.println(list);

        Deque<Integer> deque=new ArrayDeque<>();
        int[] arr={1,3,-1,-3,5,3,6,7};

        ArrayList<Integer> list=new ArrayList<>();
        int k=3;

        for(int i=0;i<arr.length;i++){
            if(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekLast()]<arr[i]){
                deque.removeLast();

            }
            deque.addLast(i);
            if(i>=k-1){
                list.add(deque.peekFirst());
            }
        }
        int[] result=new int[list.size()];
        int j=0;
        for(int i:list){
            result[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(result));
    }
}
