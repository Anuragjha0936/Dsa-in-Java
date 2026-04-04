
    public class max_array {
        public static void main(String[] args) {
            int[] arr={12,15,2,31,99};
            int max=0;
            func(arr,0,max);
            System.out.println(max_in(arr,0,max));
        }
        static void func(int[] arr,int i,int max){
            if(i==arr.length){
                System.out.println(max);
                return;
            }
            if(max<arr[i]){
                max=arr[i];
            }
            func(arr,i+1,max);
        }
        static int max_in(int[] arr,int i,int max){
            if(i==arr.length){
                return max;
            }
            if(max<arr[i]){
                max=arr[i];
            }
            return max_in(arr,i+1,max);
        }
    }


