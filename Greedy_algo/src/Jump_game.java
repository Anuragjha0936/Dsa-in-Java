public class Jump_game {
    public static void main(String[] args) {
        int[] arr={3,2,1,0,4};
        boolean flag=false;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(i<=max){
                max=Math.max(max,i+arr[i]);
            }

            if(max>=arr.length-1){
               flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
