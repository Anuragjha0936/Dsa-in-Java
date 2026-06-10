import java.util.Arrays;
import java.util.Stack;

public class largest_rect_histogram {
    public static void main(String[] args) {
        int[] arr={1,1};
        int[] prev=prev_small(arr);
        int[] next=next_small(arr);
        int max=0;

        for(int i=0;i<arr.length;i++){
            int width=next[i]-prev[i]-1;
            int area=arr[i]*width;
            max=Math.max(max,area);
        }
        System.out.println(max);
    }
    public static int[] prev_small(int[] arr){
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                result[i]=stack.peek();
                stack.push(i);
            }
        }
        return result;
    }

    public static int[] next_small(int[] arr){
        int[] result=new int[arr.length];
        Arrays.fill(result,arr.length);
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                result[i]=stack.peek();
                stack.push(i);
            }
        }
        return result;
    }

}
