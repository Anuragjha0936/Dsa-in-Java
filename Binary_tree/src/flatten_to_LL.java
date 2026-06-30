import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class flatten_to_LL {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right=new Node(5);
        root.right.right=new Node(6);

       func(root);

        Node temp=root;
        while(temp!=null){
            System.out.print(temp.val+" "+"->");
            temp=temp.right;
        }
    }
//    static void func(Node root){
//        ArrayList<Integer> list=new ArrayList<>();
//        pre_order(root,list);
//        root.left=null;
//        root.right=null;
//        Node node=root;
//        for(int i=1;i<list.size();i++){
//            node.right=new Node(list.get(i));
//            node=node.right;
//        }
//    }
//    static void pre_order(Node root,ArrayList<Integer> list){
//        if(root==null){
//            return;
//        }
//        list.add(root.val);
//        pre_order(root.left,list);
//        pre_order(root.right,list);
//    }
    static void func(Node root){
        Node current=root;
        while(current!=null){
            if(current.left!=null){
                Node temp=current.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
    }

}
