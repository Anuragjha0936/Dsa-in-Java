public class num_even_digit {
    public static void main(String[] args) {
        int[] arr={437,315,322,431,686,264,442};
        int temp=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            while(arr[i]!=0){
                temp++;
                arr[i]=arr[i]/10;
            }
            if(temp%2==0){
                count++;
            }
            temp=0;
        }
        System.out.println(count);
    }
}
