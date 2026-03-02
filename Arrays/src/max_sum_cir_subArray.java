public class max_sum_cir_subArray {
    public static void main(String[] args) {
        int[] arr={-3,-2,-3};
        int sum=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=Math.min(sum+arr[i],arr[i]);
            min=Math.min(sum,min);
        }
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        int sum1=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum1=Math.max(sum1+arr[i],arr[i]);
            max=Math.max(sum1,max);
        }
        int res=Math.max(max,total-(min));
        System.out.println(res);
    }
}
