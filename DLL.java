 class Doubly {

        private Node head;
        private Node tail;
        private int size;

        public Doubly(){
            this.size=0;
        }


        //getting size
        public int getsize(){
            return size;
        }
        public void insertfirst(int value){
            Node node=new Node(value);
            node.next=head;
            node.prev=null;
            if(head!=null){
                head.prev=node;
            }

            head=node;
            if(tail==null){
                tail=head;
            }
            size++;

        }

        public void insertlast(int value) {
            Node node=new Node(value);
            if(head==null){
                head.prev=node;
                head=node;
                tail=head;
            }
            tail.next=node;
            node.next=null;
            node.prev=tail;
            tail=node;
            size++;

        }
        public void insertindex(int value,int index){
            if(index==0){
                insertfirst(value);
                return;
            }
            else if(index==size){
                insertlast(value);
                return;
            }
            Node node=new Node(value);
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next.prev=node;
            temp.next=node;
            node.prev=temp;

            size++;
        }

        public void insertafter(int value,int after){
            Node temp=find(after);
            if(temp==null){
                System.out.println("Node doesn't exist");
            }
            Node node=new Node(value);
            node.next=temp.next;
            temp.next=node;
            node.prev=temp;
            if(temp.next!=null){
                temp.next.prev=node;
            }
            size++;


        }

        public Node find(int value){
            Node temp=head;
            while(temp!=null){
                if(temp.value==value){
                    return temp;
                }
                temp=temp.next;
            }
            return null;
        }

        public int deletefirst(){
            Node temp=head;
            head=head.next;
            if(head==null){
                tail=head;
            }
            size--;
            return temp.value;

        }

        public int deletelast(){
            Node temp=tail;
            tail=tail.prev;

            if(size<=1){
                deletefirst();
            }
            if(tail!=null){
                tail.next=null;
            }
            size--;
            return temp.value;
        }
        public void display(){
            Node node=head;
//        Node tail=null;
            while(node!=null){
                System.out.print(node.value+"->");
//            tail=node;
                node=node.next;

            }
            System.out.println("End");

            // Reverse the LL
//        while(tail!=null){
//            System.out.print(tail.value+"->");
//            tail=tail.prev;
//        }
//        System.out.println("End");
        }

        public int deleteindex(int index){
            if(index==0){
                return deletefirst();
            }
            else if(index==size-1){
                return deletelast();
            }

            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node p=temp.next;
            temp.next=p.next;
            p.next.prev=temp;

            return p.value;

        }
        private class Node{
            private int value;
            private Node next;
            private Node prev;

            public Node(int value){
                this.value=value;
            }
            public Node(int value,Node next,Node prev){
                this.value=value;
                this.next=next;
                this.prev=prev;
            }
        }
    }

    public class DLL{
        public static void main(String args[]){
            Doubly list=new Doubly();
            list.insertfirst(34);
            list.insertfirst(4);
            list.insertfirst(85);
            list.insertfirst(32);

            // list.display();

            list.insertlast(43);
            list.insertlast(3);
            list.insertlast(47);

            // list.display();

            list.insertindex(45,5);
            list.insertindex(155,4);
            // list.display();

            // list.insertafter(9,3);
            // list.display();

            // System.out.println(list.deletefirst());
            // list.display();
            // System.out.println(list.deletefirst());
            // list.display();

            list.display();
            //   System.out.println(list.deletelast());
            //   list.display();
            //   System.out.println(list.deletelast());
            //   System.out.println(list.deletelast());
            //   System.out.println(list.deletelast());
            //   list.display();

            //  System.out.println(list.getsize());

            System.out.println(list.deleteindex(3));
            list.display();
        }
    }

