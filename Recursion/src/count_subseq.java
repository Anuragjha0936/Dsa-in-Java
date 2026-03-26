import java.util.ArrayList;

public class count_subseq {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        ArrayList<Integer> p=new ArrayList<>();
        System.out.println(func(p,arr,0,0,k));
    }
    static int func(ArrayList<Integer> p,int[] u,int sum,int index,int k){
        if(index==u.length){
            if(sum==k){
                return 1;
            }else{
                return 0;
            }
        }
        p.add(u[index]);
        int left=func(p,u,sum+u[index],index+1,k);

        p.removeLast();
        int right=func(p,u,sum,index+1,k);

        return left+right;
    }
}
