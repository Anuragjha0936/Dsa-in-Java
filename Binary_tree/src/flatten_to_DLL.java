public class flatten_to_DLL {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        Pair p=new Pair();
        func(root,p);
        Node temp=p.head;
        while(temp!=null){
            System.out.print(temp.val+" "+"<->");
            temp=temp.right;
        }

    }
    static void func(Node root,Pair p){
        if(root==null){
            return;
        }
        func(root.left,p);
        if(p.head==null){
            p.head=root;
        }else{
            p.prev.right=root;
            root.left=p.prev;
        }
        p.prev=root;
        func(root.right,p);
    }
    static class Pair{
        Node head;
        Node prev;
        Pair(){
            this.head=null;
            this.prev=null;
        }
    }
}
