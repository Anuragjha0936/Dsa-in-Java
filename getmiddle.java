 class LL1 {

     Node head;
     Node tail;
    private int size;

    public LL1() {
        this.size = 0;
    }

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;


        if (tail == null) {
            tail = head;

        }
        size++;
    }

    public void insertlast(int value) {

        if (tail == null) {
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    // get middle node

    public int middle(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=(count/2)+1;
        temp=head;
        while(temp!=null){
            mid--;
            if(mid==0){
                break;
            }
            temp=temp.next;
        }
        return temp.value;
    }
    //display
     public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
         System.out.println();
     }

     public void reverse(Node node){
        if(node == null){
            return;
        }
         if(node==tail){
             head=tail;
             return;
         }
         reverse(node.next);
         tail.next=node;
         tail=node;
         tail.next=null;
     }

        public class Node {
         int value;
         Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
public class getmiddle {
       public static void main(String[] args){
           LL1 list=new LL1();
           list.insertlast(45);
           list.insertlast(4);
           list.insertlast(5);
           list.insertlast(9);
           list.insertlast(3);
           list.insertlast(44);

           System.out.println(list.middle());

       }
}

