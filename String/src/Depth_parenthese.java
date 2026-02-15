public class Depth_parenthese {
    public static void main(String[] args) {
        String s="()(())((()()))";
        int max=0;
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='('){
                count++;
                if(max<count){
                    max=count;
                }
            }else if(s.charAt(i)==')'){
                count--;
            }
        }
        System.out.println(max);
    }
}
