import java.util.LinkedList;
import java.util.Queue;

public class Traversal{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.right.left=new Node(7);
        root.right.right=new Node(8);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(10);

//        pre_order(root);
//        System.out.println();
//        in_order(root);
//        System.out.println();
//        post_order(root);

        level_order(root);
    }
    static void pre_order(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        pre_order(root.left);
        pre_order(root.right);
    }
    static  void in_order(Node root){
        if(root==null){
            return;
        }
        in_order(root.left);
        System.out.print(root.val+" ");
        in_order(root.right);
    }

    static void post_order(Node root){
        if(root==null){
            return;
        }
        post_order(root.left);
        post_order(root.right);
        System.out.print(root.val+" ");
    }

    static void level_order(Node root){
        Queue<Node> queue=new LinkedList<>();
        if(root==null){
            return;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            Node current=queue.remove();
            System.out.print(current.val+" ");

            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }

        }
    }
}