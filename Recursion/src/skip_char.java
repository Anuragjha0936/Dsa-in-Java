public class skip_char {
    public static void main(String[] args) {
        String s="anurag";
        StringBuilder result=new StringBuilder();
        System.out.println(remove(s,result,0));
    }
    static String remove(String s,StringBuilder result,int i){
        if(i==s.length()){
            return result.toString();
        }
        if(s.charAt(i)!='a'){
            result.append(s.charAt(i));
        }
        return remove(s,result,i+1);
    }
}
