public class Parenthesis {
    public static void main(String[] args) {
        String s="()(()())(())";
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                if(count>0){
                    sb1.append(sb.charAt(i));
                }
                count++;
            }
               else if(sb.charAt(i)==')'){
                    count--;
                    if(count>0){
                        sb1.append(sb.charAt(i));
                    }
                }

        }
        System.out.println(sb1);
    }
}