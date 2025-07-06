import java.util.Arrays;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] a={1,2,2,3,3,4,5,6};
        int[] b={2,3,3,5,6,6,7};
//        int[] inter=new int[a.length+b.length];
//
//        // remove the duplicates from array a[];
//        int i=0;
//        for(int j=i+1;j<a.length;j++){
//            if(a[i]!=a[j]){
//                a[i+1]=a[j];
//                i++;
//            }
//        }
//        int a_length=i;
//
//        // remove the duplicates from array b;
//        int l=0;
//        for(int m=l+1;m<b.length;m++){
//            if(b[l]!=b[m]){
//                b[l+1]=b[m];
//                l++;
//            }
//        }
//        int b_length=l;
//       int k=0;
//        for(int j=0;j<=a_length;j++){
//            for(int m=0;m<=b_length;m++){
//                if(a[j]==b[m]){
//                    inter[k]=a[j];
//                    k++;
//                }
//            }
//        }
//
//        for(int j=0;j<k;j++){
//            System.out.print(inter[j]+ " ");
//        }
//
        int max=b[0];
        for(int i=0;i<b.length;i++){
            if(max<b[i]){
                max=b[i];
            }
        }
        int[] c=new int[max+1];
        int[] d=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]&& c[b[j]]==0){
                    d[k]=a[i];
                    k++;
                    c[b[j]]+=1;
                }
            }
        }

        System.out.println(Arrays.toString(d));
    }
}
