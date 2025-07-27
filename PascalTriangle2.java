package Arrays;
import java.util.ArrayList;

public class PascalTriangle2 {
    public static void main(String[] args) {
//        List<List<Integer>> list= new ArrayList<>();
      //  ArrayList<Integer> list1=new ArrayList<>();
//        int row=5;
//
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++) {
//                list1.add(resultant(i, j));
//
//            }
//            list.add(new ArrayList<>(list1));
//            list1.clear();
//        }
        int rowIndex=3;
        ArrayList<Long> list=new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
            list.add(resultant(rowIndex+1,i));
        }

        System.out.println(list);
    }
    public static Long resultant(int row, int col){
        Long result= 1L;
        for(int i=1;i<col;i++){
            result*=(row-i);
            result=result/i;
        }
        return result;
    }
}
