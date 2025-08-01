

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Majorityelement_2 {
    public static void main(String[] args) {
        int[] arr={1,2};
//        HashSet<Integer> set=new HashSet<>();
//        // brute force approach
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count>arr.length/3){
//                set.add(arr[i]);
//            }
//            count=0;
//        }
//        ArrayList<Integer> list=new ArrayList<>(set);
//        System.out.println(list);
        int n=arr.length;
        int count1=0;
        int count2=0;
        int i=0;
        int element1=arr[i];
        int element2=arr[i];
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==element1){
                count1++;
            } else if (arr[j]==element2) {
                count2++;
            }
            else if(count1==0 && arr[j]!=element2){
                element1=arr[j];
                count1=1;
            }else if(count2==0 && arr[j]!=element2){
                element2=arr[j];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=1;
        for(int k=0;k<arr.length;k++){
            if(arr[k]==element1){
                count1++;
            }else if(arr[k]==element2){
                count2++;
            }
        }
        if(count1>n/3){
            list.add(element1);
        }
        if(count2>n/3){
            list.add(element2);
        }
        System.out.println(list);
    }
}
