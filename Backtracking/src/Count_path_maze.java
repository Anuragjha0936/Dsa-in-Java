public class Count_path_maze {
    public static void main(String[] args) {
       int result=func(3,3);
        System.out.println(result);
    }
    static int func(int row,int col){
        if(row==1 || col ==1){
            return 1;
        }
//        for right
        int left=func(row,col-1);
//        for left
        int right=func(row-1,col);

        return left+right;
    }
}