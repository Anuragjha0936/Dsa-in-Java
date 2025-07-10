import java.util.*;
public class Set {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,2,3};
        // it doesn't store the duplicate element
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
