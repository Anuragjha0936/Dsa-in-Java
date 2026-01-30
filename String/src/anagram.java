import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            if(map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }else{
//                map.put(s.charAt(i),1);
//            }
//        }
//        for(int i=0;i<t.length();i++){
//            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
//                map.put(t.charAt(i),map.get(t.charAt(i))-1);
//            }else{
//                System.out.println(false);
//                break;
//            }
//        }
//        Optimal approach
        char[] arr=t.toCharArray();
        Arrays.sort(arr);
        String sorted=new String(arr);

        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);
        String sort=new String(arr1);

            if(sort.equals(sorted)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }


    }
}
