public class child_sum {
    public static void main(String[] args) {
        Node root=new Node(35);
        root.left=new Node(20);
        root.left.left=new Node(15);
        root.left.right=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(10);
        root.right.right=new Node(5);

        System.out.println(func(root));
    }
    static int func(Node root){
        if(root==null){
            return 0;
        }
        if(isLeaf(root)){
            return root.val;
        }
        int left=func(root.left);
        int right=func(root.right);

        if(left!=-1 && right!=-1){
            if(left+right==root.val){
                return left+right;
            }
        }

        return -1;
    }
    static boolean isLeaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
}
