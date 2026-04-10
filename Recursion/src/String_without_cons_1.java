import java.util.ArrayList;

public class String_without_cons_1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        func("",3,list,0);
        System.out.println(list);
        System.out.println(list.size());
    }
    static void func(String p,int n, ArrayList<String> list,int index){
        if(p.length()==n){
            list.add(p);
            return;
        }
        func(p+"0",n,list,index+1);
        if(p.isEmpty()|| p.charAt(index-1)!='1'){
            func(p+"1",n,list,index+1);
        }
    }
}
