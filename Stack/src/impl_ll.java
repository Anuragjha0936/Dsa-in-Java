public class impl_ll {
    public static void main(String[] args) {
        Linked ll=new Linked();
        ll.push(3);
        ll.push(2);
        ll.push(1);
        ll.display();
        System.out.println(ll.pop());
        ll.display();
        ll.push(12);
        ll.push(13);
        ll.push(11);
        System.out.println(ll.peek());
        ll.display();
        System.out.println(ll.isEmpty());
    }

}
class Linked{
    Node dummy=new Node(-1);
    Node top=dummy;

    public void push(int n){
        Node newnode=new Node(n);
        top.next=newnode;
        top=top.next;
    }
    public int pop(){
        Node t=dummy.next;
        while(t.next!=top){
            t=t.next;

        }
        t.next=top.next;
        int value=top.val;
        top=t;
        return value;
    }
    public int peek(){
        return top.val;
    }
    public boolean isEmpty(){
        if(top==dummy){
            return true;
        }else{
            return false;
        }
    }
    public void display(){
        Node temp=dummy.next;
        while (temp != null) {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
}
