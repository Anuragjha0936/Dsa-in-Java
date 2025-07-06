public class maxcosecutive {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        findMaxConsecutiveOnes(arr);
    }
    public static void findMaxConsecutiveOnes(int[] arr) {
        int count=0;
        int k=0;
        int n=arr.length;
        int[] c=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1 ){
                count++;
            }

            else{
                c[k]=count;
                k++;
                count=0;
            }
        }

        c[k]=count;


        int max=c[0];
        for(int j=0;j<arr.length;j++){
            if(max<=c[j]){
                max=c[j];
            }
        }
        System.out.println(max);
    }
}
