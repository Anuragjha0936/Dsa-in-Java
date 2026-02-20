import java.util.Arrays;

public class Assign_cookies {
    public static void main(String[] args) {
       int[] arr={10,9,8,7};
       int[] b={5,6,7,8};
       int i=0;
       int j=0;
       int count=0;
        Arrays.sort(arr);
        Arrays.sort(b);
       while(i< arr.length && j <b.length){
          if(b[j]>=arr[i]){
              count++;
              i++;
          }
          j++;
       }

        System.out.println(count);
    }
}