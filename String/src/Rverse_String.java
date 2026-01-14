import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rverse_String {
    public static void main(String[] args) {
       String str=" the sky is  blue ";
////        Trim the string
////        String cleaned = str.trim().replaceAll("\\s+", " ");
////        System.out.println(cleaned);
//        ArrayList<StringBuilder> list=new ArrayList<>();
//        StringBuilder temp= new StringBuilder();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)!=' '){
//                temp.append(str.charAt(i));
//            }else {
//                list.add(temp);
//                temp = new StringBuilder();
//            }
//        }
//        list.add(temp);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(String.join(" ",list));
        int i=str.length()-1;
        int e=-1;
        StringBuilder result=new StringBuilder();
        while(i>=0){

            while(i>=0 && str.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            e=i;
            while(i>=0 && str.charAt(i)!=' '){
                i--;
            }
            if(!result.isEmpty()){
                result.append(" ");
            }
            result.append(str.substring(i+1,e+1));
        }
        System.out.println(result);
        }
    }

