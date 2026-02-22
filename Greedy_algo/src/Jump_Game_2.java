import java.util.Arrays;

public class Jump_Game_2 {
    public static void main(String[] args) {
        int[] arr={7,0,9,6,9,1,7,9,0,1,2,9,0,3};
//       int res= min_jump(arr,0,0);
//        System.out.println(res);
        System.out.println(sol(arr));

    }
//    static int min_jump(int[] arr,int index,int jumps){
//        if(index>= arr.length-1){
//            return jumps;
//        }
//        int mini=Integer.MAX_VALUE;
//        for(int i=1;i<=arr[index];i++){
//            mini=Math.min(mini,min_jump(arr,index+i,jumps+1));
//
//        }
//        return mini;

    static int sol(int[] arr){
        int far=0;
        int currentend=0;
        int jump=0;
        for(int i=0;i<arr.length-1;i++){
            far=Math.max(far,i+arr[i]);

            if(i==currentend){
                jump++;
                currentend=far;
            }

            if(currentend>=arr.length){
                return jump;
            }
        }
        return 1;
    }
    }

