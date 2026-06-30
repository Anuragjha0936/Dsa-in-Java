import java.util.ArrayList;

public class morris_preoredr {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        ArrayList<Integer> list=new ArrayList<>();
        preorder(root,list);
        System.out.println(list);
    }
    static void preorder(Node root,ArrayList<Integer> list){
        Node curr=root;
        while(curr!=null){
            if(curr.left==null){
                list.add(curr.val);
                curr=curr.right;
            }
            else{
                Node pp=findpp(curr);
                if(pp.right==null){
                    pp.right=curr;
                    list.add(curr.val);
                    curr=curr.left;
                }else{
                    pp.right=null;
                    curr=curr.right;
                }
            }
        }

    }
    static Node findpp(Node curr){
        Node pp=curr.left;
        while(pp.right!=null && pp.right!=curr){
            pp=pp.right;
        }
        return pp;
    }
}
