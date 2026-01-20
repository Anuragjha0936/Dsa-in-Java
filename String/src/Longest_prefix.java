import java.util.Arrays;
import java.util.Collections;

public class Longest_prefix {
    public static void main(String[] args) {
        String[] arr={"ab","a"};

//        String result=arr[0];
//        int i=0;
//        int j=0;
//        for(int k=1;k< arr.length;k++){
//            while (i<result.length() && j<arr[k].length()){
//                if(result.charAt(i)==arr[k].charAt(j)){
//                    i++;
//                    j++;
//                }else{
//                    result=result.substring(0,j);
//                    break;
//                }
//            }
//            result=result.substring(0,j);
//            i=0;
//            j=0;
//        }
//        optimised approach
        Arrays.sort(arr);
        String result=arr[0];
        int i=0;
        while(i<result.length()){
            if(result.charAt(i)==arr[arr.length-1].charAt(i)){
                i++;
            }else{
                result=result.substring(0,i);
                break;
            }
        }
        System.out.println(result);
    }
}
