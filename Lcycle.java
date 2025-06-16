class linked{

    private Node head;
    private Node tail;
    private int size;

    public linked(){
        this.size=0;
    }

    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;

        }
        size++;
    }

    public void insertlast(int value){
        Node node=new Node(value);
        if(head==null){
            insertfirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }

    }
    public boolean llcycle(){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

//    public void cycle(){
//        Node temp=head;
//        while(temp.value!=6){
//            temp=temp.next;
//        }
//        tail.next=temp;
//    }

    public int lengthcycle(){
        Node fast=head;
        Node slow=head;


        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node temp=slow;
                int count=0;
                do{
                    temp=temp.next;
                    count++;
                }while(temp!=slow);
                return count;
            }
        }
        return 0;
    }

    public int detectnode(){
        Node first=head;
        Node second =head;
        Node fast=head;
        Node slow=head;
        int length=0;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthcycle();
               break;
            }
        }
        if(length==0){
            return 0;
        }
        while(length>0){
            second=second.next;
            length--;
        }

        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return second.value;
    }

    // Happy number
    public int findsq(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
    }

    public boolean Happy(int num){
        int slow=num;
        int fast=num;

        do{
            slow=findsq(slow);
            fast=findsq(findsq(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        else {
            return false;
        }
    }

    // middle node list
    public int findmiddle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.value;
    }
    //sorting ll using Bubble sort
    public void bubblesort(){
        Node temp1=head;
        Node temp2=head.next;

        for(int i=0;i<lengthcycle();i++){
            for(int j=0;j<lengthcycle()-1-i;j++){
                if(temp1.value>temp2.value){
                    Node  temp=temp1;
                    temp1= temp2;
                    temp2=temp;
                }
            }
        }
        Node t=head;
        while(t!=null){
            System.out.print(t.value+" ");
            t=t.next;
        }
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
public class Lcycle
{
    public static void main(String[] args) {

        linked list=new linked();
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(5);
        list.insertlast(6);
        list.insertlast(11);
        list.insertlast(9);
        list.insertlast(12);
        list.insertlast(14);
        list.insertlast(16);
        list.insertlast(20);

       // list.cycle();
        //list.display();

//        boolean flag=list.llcycle();
//        if(flag==true){
//            System.out.println("cycle exist");
//        }else{
//            System.out.println("cycle doesn't exist");
//        }

//        System.out.println(list.lengthcycle());
//
//        System.out.println(list.detectnode());
//
//        System.out.println(list.Happy(19));

        //System.out.println(list.findmiddle());
        list.bubblesort();
    }

}

