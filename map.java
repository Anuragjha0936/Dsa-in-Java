import java.util.*;

public class map {
    public static void main(String[] args) {
        String name="Anurag";
        int code=name.hashCode();
        // hashcode method is use to covert the element into integer value
        Integer val=100;
        // for the integer value it uses the same value
        // it doesn't work on primitive datatype
        int code1= val.hashCode();
        System.out.println(code1);

        HashMap<String,Integer> map=new HashMap<>();
        map.put("Anurag",12);
        map.put("Rahul",2);
        map.put("Ajay",13);
        System.out.println(map.get("Anurag"));
        System.out.println(map.containsKey("Karan"));
        System.out.println(map.getOrDefault("atul",77));

        // iteration of map
        // we are converting the map into set
       for(Map.Entry<String,Integer> e:map.entrySet()){
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }

       // to remove the element in the map
        map.remove("Anurag");
        System.out.println(map);
    }
}