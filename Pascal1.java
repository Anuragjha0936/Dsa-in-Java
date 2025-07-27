package Arrays;

import java.util.Scanner;

public class Pascal1 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int row=5;
        int column=2;
        resultant(row,column);
    }
    public static void resultant(int row,int col){
        int result=1;
        for(int i=1;i<col;i++){
            result*=(row-i);
            result=result/i;
        }
        System.out.println(result);
    }
}
