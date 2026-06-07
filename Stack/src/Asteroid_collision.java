import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.List;
public class Asteroid_collision {
    public static void main(String[] args) {
        int[] arr={3,5,-6,2,-1,4};
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i<arr.length){
            while(!stack.isEmpty() && stack.peek()>0 && arr[i]<0){
                if(Math.abs(arr[i])>stack.peek()){
                    stack.pop();
                    if(stack.isEmpty()){
                        stack.push(arr[i]);
                    }
                }else if(Math.abs(arr[i])==stack.peek()){
                    stack.pop();
                }else{
                    break;
                }
            }
            if(arr[i]>0){
                stack.push(arr[i]);
            }
            i++;
        }
//        int[] result=new int[stack.size()];
//        int j=0;
//        while(!stack.isEmpty()){
//            result[j]=stack.peek();
//            j++;
//            stack.pop();
//        }
        System.out.println(Arrays.toString(stack.toArray()));
    }

}
