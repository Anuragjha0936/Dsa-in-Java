import java.util.Stack;

public class remove_k_digit {
    public static void main(String[] args) {
        String s="112";

        int k=1;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            while(!stack.isEmpty() && stack.peek()>s.charAt(i) && k>0){
                stack.pop();
                k--;
            }
            stack.push(s.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder result=new StringBuilder();
        for(char c:stack){
            result.append(c);
        }
        System.out.println(result);
        int index=0;
        while(index<result.length() && result.charAt(index)=='0'){
            index++;
        }

        String res=result.substring(index);
        String ans=res.isEmpty()?"0":res;
        System.out.println(ans);
    }
}
