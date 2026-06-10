import java.util.Arrays;
import java.util.Stack;

public class Sum_subarray_ranges {
    public static void main(String[] args) {
        int[] arr={4,-2,-3,4,1};
//        Brute force approach
//        int max;
//        int min;
//        int total=0;
//
//        for(int i=0;i<arr.length;i++){
//            max=arr[i];
//            min=arr[i];
//            for(int j=i;j<arr.length;j++){
//                max=Math.max(max,arr[j]);
//                min=Math.min(min,arr[j]);
//
//                total+=max-min;
//            }
//        }
//        System.out.println(total);

//        optimised approach
        int[] prev_s=prev_smaller(arr);
        int[] next_s=nextSmaller(arr);
        int[] prev_g=prev_greater(arr);
        int[] next_g=next_greater(arr);
        System.out.println(Arrays.toString(prev_s));
        System.out.println(Arrays.toString(next_s));
        System.out.println(Arrays.toString(prev_g));
        System.out.println(Arrays.toString(next_g));
        int total=0;
        for(int i=0;i<arr.length;i++){
            int left_s=i-prev_s[i];
            int right_s=next_s[i]-i;
            int left_g=i-prev_g[i];
            int right_g=next_g[i]-i;

            int max=arr[i]*left_g*right_g;
            int min=arr[i]*left_s*right_s;
            total+=(max-min);
        }
        System.out.println(total);
    }
    public static int[] prev_smaller(int[] arr){
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                result[i]=stack.peek();
                stack.push(i);

            }
        }
        return result;
    }
    public static int[] nextSmaller(int[] arr){
        int[] result=new int[arr.length];
        int n= arr.length;
        Arrays.fill(result,n);
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                result[i]=stack.peek();
                stack.push(i);
            }
        }
        return result;
    }
    public static int[] prev_greater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        for(int i=0;i< arr.length;i++){

                while(!stack.isEmpty() && arr[stack.peek()]<arr[i] ){
                    stack.pop();
                }

            if(stack.isEmpty()){
                stack.push(i);
            }else{
                result[i]=stack.peek();
                stack.push(i);
            }
        }
        return result;
    }
    public static int[] next_greater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[arr.length];
        Arrays.fill(result,arr.length);
        for(int i=arr.length-1;i>=0;i--){

                while(!stack.isEmpty() && arr[stack.peek()]<=arr[i] ){
                    stack.pop();
                }

            if(stack.isEmpty()){
                stack.push(i);
            }else{
                result[i]=stack.peek();
                stack.push(i);
            }
        }
        return result;
    }
}
