package Arrays;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int row_s=0;
        int row_e=n-1;
        int col_s=0;
        int col_e=n-1;
        
        while(col_s<=col_e){
            if(row_s<=row_e){
                for(int c=col_s;c<=col_e;c++){
                    System.out.println(arr[row_s][c]);
                }
                row_s++;
            }
            if(col_s<=col_e){
                for(int r=row_s;r<=row_e;r++){
                    System.out.println(arr[r][col_e]);
                }
                col_e--;
            }
            if(row_s<=row_e){
                for(int c=col_e;c>=col_s;c--){
                    System.out.println(arr[row_e][c]);
                }
                row_e--;
            }
            if(col_s<=col_e){
                for(int r=row_e;r>=row_s;r--){
                    System.out.println(arr[r][col_s]);
                }
                col_s++;
            }
        }
    }
}
