import java.util.*;

public class unionArray {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        int n1=arr1.length;
        int n2=arr2.length;
        union(arr1,arr2,n1,n2);
    }
    public static void union(int[] arr1,int[] arr2,int n1,int n2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }

        System.out.println(set);
    }
}
