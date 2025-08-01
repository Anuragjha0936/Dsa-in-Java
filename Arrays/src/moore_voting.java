

import java.util.ArrayList;
import java.util.HashSet;

public class moore_voting {
    public static void main(String[] args) {
        int[] arr={-1,100,2,100,100,4,100};
        int n=arr.length;
        int count=0;
        int i=0;
        int element=arr[i];
        for(int j=0;j<arr.length;j++){
            if(arr[j]==element) {
                count++;
            }
            else if(count==0 ){
                count=1;
                element=arr[j];
            }else{
                count--;
            }
        }
        int count1=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]==element){
                count1++;
            }
        }
        if(count1>n/2){
            System.out.println(element);
        }else{
            System.out.println("0");
        }

    }
}
