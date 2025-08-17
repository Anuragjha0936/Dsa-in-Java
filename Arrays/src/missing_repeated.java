import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class missing_repeated {
   static int[] arr1;
    public static void main(String[] args) {
       int[][] arr={{9,1,7},{8,9,2},{3,4,6}};
       int[] arr2=new int[2];
//        int[][] arr={{1,3},{2,2}};
//        int n=arr.length;
//        int k=((n*n)+1)*(n*n);
//        int og_sum=k/2;
//        int rp=0;
//        int sum=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        HashSet<Integer> set=new HashSet<>();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(set.contains(arr[i][j])){
//                    list.add(arr[i][j]);
//                    rp=arr[i][j];
//                    break;
//                }else{
//                    set.add(arr[i][j]);
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                sum+=arr[i][j];
//            }
//        }
//        int mis_num=og_sum-(sum-rp);
//        list.add(mis_num);
//        System.out.println(list);
//
//        optimal Approach
        int n=arr.length;
        arr1=new int[(n*n)+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=arr[i][j];
                arr1[num]++;
            }
        }
        for(int k=1;k<(n*n)+1;k++){
            if(arr1[k]==2){
                arr2[0]=k;
            }
            if(arr1[k]==0){
                arr2[1]=k;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
