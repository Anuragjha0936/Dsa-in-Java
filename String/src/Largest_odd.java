import java.util.Scanner;

public class Largest_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "52";
        String result="";
        int digit;
        for(int i=s.length()-1;i>=0;i--){
            digit=s.charAt(i)-'0';
            if(digit%2!=0){
                result=s.substring(0,i+1);
                break;
            }
        }
        System.out.println(result);
    }
}
