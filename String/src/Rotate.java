public class Rotate {
    public static void main(String[] args) {
      String s1="abcde";
      String goal="cdeab";
//      String result=s1;
//      for(int i=0;i<result.length();i++) {
//          result = reverse(0, i-1, result);
//          result=reverse(i,s1.length()-1,result);
//          result=reverse(0,s1.length()-1,result);
//          if(result.compareTo(goal)==0){
//              System.out.println(true);
//              break;
//          }else{
//            result=s1;
//          }
//      }
//        optimal approach
        if(s1.length()!=goal.length()){
            System.out.println(false);
        }
        s1=s1+s1;
        if(s1.contains(goal)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
//    static String reverse(int si,int ei,String s){
//        char[] arr=s.toCharArray();
//        while(si<ei){
//            char c=arr[si];
//            arr[si]=arr[ei];
//            arr[ei]=c;
//            si++;
//            ei--;
//        }
//        return new String(arr);
//    }
}
