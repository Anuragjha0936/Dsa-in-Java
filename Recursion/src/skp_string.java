public class skp_string {
    public static void main(String[] args) {
        String s="anuragshekharanuragjha";
        String skippable="anurag";
        StringBuilder result=new StringBuilder();
        System.out.println(skip(s,skippable,result));
    }
    static String skip(String s,String skippable,StringBuilder result){
        if(s.length()==0){
            return result.toString();
        }
        if(s.startsWith(skippable)){
            return skip(s.substring(skippable.length(),s.length()),skippable,result);
        }else{
            result.append(s.substring(0,1));
            return skip(s.substring(1,s.length()),skippable,result);
        }
    }
}
