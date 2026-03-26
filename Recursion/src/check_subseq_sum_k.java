import java.util.ArrayList;


public class check_subseq_sum_k {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        ArrayList<Integer> p=new ArrayList<>();
        if(func(p,arr,0,k,0)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
    static boolean func(ArrayList<Integer> p, int[] u, int sum, int k, int index){
        if(index==u.length){
            if(sum==k){
                return true;
            }
            return false;
        }
        p.add(u[index]);
         if(func(p,u,sum+u[index],k,index+1)){
          return true;
         }
        p.removeLast();
        if( func(p,u,sum,k,index+1)){
            return true;
        }
        return false;
    }
}
