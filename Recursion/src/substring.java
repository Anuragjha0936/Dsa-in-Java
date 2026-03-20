import java.util.ArrayList;
import java.util.Collections;

public class substring {
    public static void main(String[] args) {
        String s="abc";
//        rec("",s);
        ArrayList<String> list=rec1("",s);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<String> result=new ArrayList<>();
        rec2("",s,result);
        System.out.println(result);
    }
    static void rec(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=u.charAt(0);
        rec(p+ch,u.substring(1));
        rec(p,u.substring(1));
    }
//    object type -> adding the elements in the list in the body of the function
    static ArrayList<String> rec1(String p, String u){
        if (u.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=u.charAt(0);
        ArrayList<String> left=rec1(p+ch,u.substring(1));
        ArrayList<String> right=rec1(p,u.substring(1));
        left.addAll(right);
        return left;
    }
//    reference type -> passing the list in the arguments
    static void rec2(String p,String u,ArrayList<String> list){
        if(u.isEmpty()){
            list.add(p);
            return;
        }
        char ch=u.charAt(0);
        rec2(p+ch,u.substring(1),list);
        rec2(p,u.substring(1),list);
    }
}
