import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Roman_Int {
    public static void main(String[] args) {
        String s="III";
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

//        Brute force approach
        
        int count=0;
//        int i=s.length()-1;
//        while(i>=0){
//            if(s.charAt(i)=='V' || s.charAt(i)=='X'){
//                if(i-1>=0 &&s.charAt(i-1)=='I' ){
//                    count+=map.get(s.charAt(i))-1;
//                    i--;
//                }else{
//                    count+=map.get(s.charAt(i));
//                }
//            }
//            else if(s.charAt(i)=='L' || s.charAt(i)=='C'){
//                if(i-1>=0 &&s.charAt(i-1)=='X' ){
//                    count+=map.get(s.charAt(i))-10;
//                    i--;
//                }else{
//                    count+=map.get(s.charAt(i));
//                }
//            }
//            else if(s.charAt(i)=='D' || s.charAt(i)=='M'){
//                if(i-1>=0 && s.charAt(i-1)=='C' ){
//
//                    count+=map.get(s.charAt(i))-100;
//                    i--;
//                }else{
//                    count+=map.get(s.charAt(i));
//                }
//            }else{
//                count+=map.get(s.charAt(i));
//            }
//            i--;
//
//        }

//        Optimised approach
        int i=0;

        while(i<s.length()){
            int current=map.get(s.charAt(i));
            if(i+1<s.length() && current< map.get(s.charAt(i+1))){
                count+=map.get(s.charAt(i+1))-current;
                i++;
            }else{
                count+=current;
            }
            i++;
        }
        System.out.println(count);
    }
}
