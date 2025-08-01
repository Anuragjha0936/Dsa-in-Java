

import java.util.Arrays;
import java.util.HashSet;

public class setmatrixzero {
    public static void main(String[] args) {
        int[][] arr={{0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        // brute force approach
//       int rows=arr.length;
//       int coulumn=arr[0].length;
//       boolean[] rowzero=new boolean[rows];
//        boolean[] colzero=new boolean[coulumn];
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<coulumn;j++){
//                if(arr[i][j]==0){
//                   rowzero[i]=true;
//                   colzero[j]=true;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if(rowzero[i] || colzero[j]){
//                    arr[i][j]=0;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

        // better
//        HashSet<Integer> row =new HashSet<>();
//        HashSet<Integer> col=new HashSet<>();
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(arr[i][j]==0){
//                    row.add(i);
//                    col.add(j);
//                }
//            }
//        }
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(row.contains(i) || col.contains(j)){
//                    arr[i][j]=0;
//                }
//            }
//        }
//
        // optimal
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){

                    arr[i][0]=0;

                    arr[0][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[0][j]==0 || arr[i][0]==0){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }


}
