import java.util.Arrays;

public class celebrity_problem {
    public static void main(String[] args) {
        int[][] arr={{1,0,1,1},
                {0,1,1,1},
                {1,1,1,1},
                {0,0,0,1}};
//       Brute force approach
//        int[] knowme=new int[arr.length];
//        int[] iknow=new int[arr.length];
//        Arrays.fill(knowme,0);
//        Arrays.fill(iknow,0);
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i][j]==1 && i!=j){
//                    iknow[i]+=1;
//                    knowme[j]+=1;
//                }
//            }
//        }
//        int celeb=-1;
//        for(int i=0;i<arr.length;i++){
//            if(knowme[i]==arr.length-1 && iknow[i]==0 ){
//                celeb=i;
//            }
//        }
//        System.out.println(celeb);
//        optimised approach
        int left=0;
        int right=arr.length-1;
        int celeb=-1;

        while(left<right){
            if(arr[left][right]==1){
                left++;
            }else if(arr[right][left]==1){
                right--;
            }

            else{
                left++;
                right--;
            }
            if(left==right){
                if(check(left,arr)){
                    celeb=left;
                }
            }

        }
        System.out.println(celeb);
    }
    public static boolean check(int left,int[][] arr){
        for(int j=0;j<arr.length;j++){
            if(arr[left][j]==1 && left!=j) return false;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i][left]!=1 && i!=left) return false;
        }
        return true;
    }
}
