import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(check(s,t));

    }
    public static boolean check(String s,String t){
//        HashMap<Character,Character> map=new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            if(!map.containsKey(s.charAt(i)) ){
//                if(!map.containsValue(t.charAt(i))) {
//                    map.put(s.charAt(i), t.charAt(i));
//                }else{
//                    return false;
//                }
//            }else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)){
//                return  false;
//            }
//        }
//        return true;
//        Optimal Approach
        int[] mapS=new int[256];
        int[] mapT=new int[256];

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mapS[c1]!=0 || mapT[c2]!=0){
                if(mapS[c1]!=c2 || mapT[c2]!=c1){
                    return false;
                }
            }else{
                mapS[c1]=c2;
                mapT[c2]=c1;
            }
        }
        return true;
    }
}
