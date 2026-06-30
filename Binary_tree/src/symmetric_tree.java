import java.util.HashMap;

public class symmetric_tree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(4);
        root.right.right=new Node(7);

        boolean flag=false;
        if(root.left!=null && root.right!=null){
            flag=func(root.left,root.right);
        }
        System.out.println(flag);
    }
    static boolean func(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null && root2!=null){
            return false;
        }
        if(root1!=null && root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        boolean left=func(root1.left,root2.right);
        boolean right=func(root1.right,root2.left);
        return (root1.val==root2.val &&left && right);

    }

}
