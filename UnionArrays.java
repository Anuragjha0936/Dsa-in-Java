import java.util.Arrays;

public class UnionArrays {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
        int n1=arr1.length-1;
        int n2=arr2.length-1;
        int[] union=new int[12];
        int i=0,j=0,k=0;
        while(i<=n1 && j<=n2){
            if(arr1[i] < arr2[j]){
                union[k]=arr1[i];
                i++;
                k++;
            }
            else{
                union[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<=n1){
            union[k]=arr1[i];
            i++;
            k++;
        }
        while(j<=n2){
            union[k]=arr2[j];
            j++;
            k++;
        }
        int m=0;
        for(int n=m+1;n<union.length;n++){
            if(union[m]!=union[n]){
                union[m+1]=union[n];
                m++;
            }
        }
       for(int l=0;l<=m;l++){
           System.out.print(" "+union[l]);
       }
    }
}
