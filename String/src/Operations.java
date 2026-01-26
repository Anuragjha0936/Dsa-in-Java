public class Operations {
    public static void main(String[] args) {
        String[] arr={"--X","X++","X++"};
        int x=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i].contains("+")){
                x+=1;
            }else{
                x-=1;
            }
        }
    }
}
