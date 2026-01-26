public class Shuffle_String {
    public static void main(String[] args) {
        String s="codeleet";
        int[] arr={4,5,6,7,0,2,1,3};
        char[] arr1=new char[s.length()];
        for (int i=0;i< s.length();i++){
            arr1[arr[i]]=s.charAt(i);
        }
        new String(arr1);
        System.out.println(arr1);
    }
}
