import java.util.Arrays;
import java.util.Stack;

public class next_greater {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty() && stack.peek()<=arr[i]){
                while(!stack.isEmpty() && stack.peek()<=arr[i] ){
                    stack.pop();
                }
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
