import java.util.LinkedList;
import java.util.Queue;

public class level_order_successor {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        Queue<Node> queue=new LinkedList<>();
        int val=7;
        Node result=new Node(-1);
        queue.add(root);
        while(!queue.isEmpty()){
            Node node=queue.peek();
            if(node.val==val){
                queue.remove();
                result.val=queue.isEmpty()?-1:queue.peek().val;
                break;
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            queue.remove();
        }
        System.out.println(result.val);
    }
}
