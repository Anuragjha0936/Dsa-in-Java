import java.util.ArrayList;

public class count_no_consv_1 {
    public static void main(String[] args) {
        int count=func("",3,0);
        System.out.println(count);
    }
    static int func(String p,int n,int index){
        if(p.length()==n){
            return 1;
        }
        int count=0;
        count+= func(p+"0",n,index+1);
        if(p.isEmpty()|| p.charAt(index-1)!='1'){
            count+= func(p+"1",n,index+1);
        }
        return count;
    }
}
