import java.util.ArrayList;

public class root_to_leaf {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        func(root,list,temp);
        System.out.println(list);
    }
    static void func(Node root,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp){
        temp.add(root.val);
        if(isLeaf(root)){
            list.add(new ArrayList<>(temp));
            temp.removeLast();
            return;
        }

        func(root.left,list,temp);
        func(root.right,list,temp);
        temp.removeLast();

    }
    static boolean isLeaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
}
