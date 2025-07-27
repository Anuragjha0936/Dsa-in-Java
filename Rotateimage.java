package Arrays;

import java.util.Arrays;

public class Rotateimage {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
       int n=arr.length;
       // vertical reversal
        int k=0;
        int m=arr.length-1;
        for(int j=0;j<n;j++){
            while(k<=m){
                int temp=arr[k][j];
                arr[k][j]=arr[m][j];
                arr[m][j]=temp;
                k++;
                m--;
            }
            k=0;
            m=arr.length-1;
        }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i<j){
                   int temp=arr[i][j];
                   arr[i][j]=arr[j][i];
                   arr[j][i]=temp;
               }
           }
       }

        System.out.println(Arrays.deepToString(arr));
    }
}
