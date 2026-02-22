import java.util.HashMap;

public class Lemonade_change {
    public static void main(String[] args) {
        int[] arr={5,5,5,5,20,20,5,5,20,5};
        int five=0;
        int ten=0;
        System.out.println(lemonade(five,ten,arr));

    }
    static boolean lemonade(int five,int ten,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                five++;
            }else if(arr[i]==10){
                five--;
                ten++;
            }else{
                if(ten>0 && five>0){
                    five--;
                    ten--;
                }else{
                    five-=3;
                }
            }
            if(five<0){
                return false;
            }
        }
        return true;
    }
}
