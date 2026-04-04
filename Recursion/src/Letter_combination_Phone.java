import java.util.ArrayList;
import java.util.HashMap;

public class Letter_combination_Phone {
    public static void main(String[] args) {
        String[] mapping = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
//        HashMap<Character,String> map=new HashMap<>();
//        map.put('1',"");
//        map.put('2',"abc");
//        map.put('3',"def");
//        map.put('4',"ghi");
//        map.put('5',"jkl");
//        map.put('6',"mno");
//        map.put('7',"pqrs");
//        map.put('8',"tuv");
//        map.put('9',"wxyz");

        String digit="23";
        ArrayList<String> list=new ArrayList<>();
        func("",digit,0,list,mapping);
        System.out.println(list);

    }
    static void func(String p,String u,int index,ArrayList<String> list,
                     String[] mapping){
        if(index==u.length()){
            list.add(p);
            return;
        }
        int num=u.charAt(index)-'0';
        String val=mapping[num];
//        String val=map.get(u.charAt(index));
        for(int i=0;i<val.length();i++){
            char ch=val.charAt(i);
            func(p+ch,u,index+1,list,mapping);
        }
    }
}
