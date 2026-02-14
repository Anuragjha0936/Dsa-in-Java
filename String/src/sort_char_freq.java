import java.util.*;
public class sort_char_freq {
    public static void main(String[] args) {

        String s="Anurag";
        StringBuilder sb=new StringBuilder();
        List<Character>[] bucket= new ArrayList[s.length()+1];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        Set<Character> set=map.keySet();
        for(Character c:set){
            if(bucket[map.get(c)]==null){
                bucket[map.get(c)]=new ArrayList<>();
            }
            bucket[map.get(c)].add(c);
        }
        
        for(int i= bucket.length-1;i>=1;i--){
            if (bucket[i] != null) {
                for(Character c:bucket[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
