import java.util.Stack;

public class Valid_parentheses {
    public static void main(String[] args) {
        String s="([]){()}";
        boolean flag=true;
        Stack<Character> stack=new Stack<>();
        if(s.length()==1){
            flag=false;
        }
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else{
                if(!isMatching(s,stack,i)){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(true);
        }else{
            System.out.println(flag);
        }

    }
    public static boolean isMatching(String s,Stack<Character> stack,int i){
        if(stack.peek()=='(' && s.charAt(i)==')' || stack.peek()=='[' && s.charAt(i)==']' || stack.peek()=='{' && s.charAt(i)=='}'){
            stack.pop();
            return true;
        }
        return false;
    }

}
