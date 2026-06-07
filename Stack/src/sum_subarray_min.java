import java.util.Arrays;
import java.util.Stack;

public class sum_subarray_min {
    public static void main(String[] args) {
        int[] arr={3,1,2,4};

//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//           int  mini=arr[i];
//            for(int j=i;j<arr.length;j++){
//                mini=Math.min(mini,arr[j]);
//                sum+=mini;
//            }
//        }
//        System.out.println(sum);
//        to avoid the overflow
//        perform mod to the answer

        long total=0;
        int[] prev=prev_smaller(arr);
        int[] next=nextSmaller(arr);
        int mod=(int)(1e9+7);
        long contribution;

        System.out.println(Arrays.toString(prev));
        System.out.println(Arrays.toString(next));
        for(int i=0;i<arr.length;i++){
            int left=i-prev[i];
            int right=next[i]-i;

            contribution=((long) arr[i] *left*right)%mod;
            total=(total+contribution)%mod;
        }
        int result=(int)total;
        System.out.println(result);
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
}
