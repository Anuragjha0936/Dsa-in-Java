import java.util.HashMap;

public class LRU_Cache {
    static class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    static Node head;
    static Node tail;
    static HashMap<Integer,Node> map;
    static int cap;
    public LRU_Cache(int cap){
        this.cap=cap;
        map=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    public static void insert_after_head(Node node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }
    public static void delete(Node node){
        Node temp=node.prev;
        temp.next=node.next;
        node.next.prev=temp;
    }
    public  int get(int key){
        if(map.containsKey(key)){
            Node result=map.get(key);
            delete(result);
            insert_after_head(result);
            return result.value;
        }
        return -1;
    }
    public static void put(int key,int value){
        if(map.containsKey(key)){
                Node node=map.get(key);
                node.value=value;
                delete(map.get(key));
                insert_after_head(map.get(key));
                map.put(key,node);
        }
        else {
            if (!map.containsKey(key) && map.size() < cap) {
                Node node = new Node(key, value);
                insert_after_head(node);
                map.put(key, node);
            } else {
                Node lru = tail.prev;
                delete(lru);
                map.remove(lru.key);
                Node node = new Node(key, value);
                insert_after_head(node);
                map.put(key, node);
            }
        }
    }
//    public void display(){
//        Node temp=head.next;
//        while(temp!=tail){
//            System.out.print(temp.key +" "+ temp.value+"->");
//            temp=temp.next;
//        }
//    }
}
class Main{
    public static void main(String[] args) {
        LRU_Cache list=new LRU_Cache(2);
        list.put(1,1);
        list.put(2,2);
        System.out.println(list.get(1));
        list.put(3,3);
        System.out.println(list.get(2));
        list.put(4,4);
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.get(4));


    }
}