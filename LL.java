public class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
//insert at first
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;


        if(tail==null){
            tail=head;

        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");

    }
    //insert at last
    public void insertlast(int value){

        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        node.next=null;
        tail=node;
        size++;
    }
    //insert at index
    public void insert(int value,int index){
        if(index==0){
            insertfirst(value);
            return;
        }
        else if(index==size){
            insertlast(value);
        }
        Node node=new Node(value);
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;

    }
    //delete first
    public int  deletefirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    //delete at last
    public int deletelast(){
        int value=tail.value;
        Node temp=head;
        if(tail==null){
            head.next=null;

        }
        for(int i=1;i<size;i++){
            temp= temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        return value;
    }
    private class Node{
       private int value;
        private Node next;

        public Node(int value){
            this.value=value;

        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
