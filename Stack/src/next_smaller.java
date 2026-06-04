import java.util.Arrays;
import java.util.Stack;

public class next_smaller {
    public static void main(String[] args) {
        int[] arr={4,8,5,2,25};
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                result[i]=stack.peek();
                stack.push(arr[i]);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
