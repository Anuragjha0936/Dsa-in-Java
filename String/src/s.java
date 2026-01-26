import java.util.ArrayList;
import java.util.List;

public class s {
    public static  void main(String[] args) {
        List<String> list=new ArrayList<>();
        int n=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                Integer.toString(i);
                list.add(String.valueOf(i));
            }
        }
    }
}
