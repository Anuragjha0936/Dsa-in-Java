import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class boundary_trav {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        ArrayList<Integer> list=new ArrayList<>();
        addleft(root,list);
        addleafNode(root,list);
        addRight(root,list);

        System.out.println(list);
    }
    static boolean isLeaf(Node node){
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }
    static void addleft(Node root,ArrayList<Integer> res){
        Node temp=root;
        while(temp!=null){
            if(!isLeaf(temp)){
                res.add(temp.val);
            }
            if(temp.left!=null){
                temp=temp.left;
            }else{
                temp=temp.right;
            }

        }
    }
    static void addleafNode(Node root, ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.val);
            return;
        }
        if(root.left!=null){
            addleafNode(root.left,res);
        }
        if(root.right!=null){
            addleafNode(root.right,res);
        }

    }
    static void addRight(Node root,ArrayList<Integer> res){
        Stack<Integer> stack=new Stack<>();
        Node temp=root.right;
        while(temp!=null){
            if(!isLeaf(temp)){
                stack.push(temp.val);
            }
            if(temp.right!=null){
                temp=temp.right;
            }else{
                temp=temp.left;
            }
        }
        while(!stack.isEmpty()){
            res.add(stack.peek());
            stack.pop();
        }
    }
}
