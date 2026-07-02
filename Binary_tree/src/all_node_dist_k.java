import javax.swing.tree.TreeNode;
import java.util.*;

public class all_node_dist_k {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(5);
        root.right=new Node(1);
        root.left.left=new Node(6);
        root.left.right=new Node(2);
        root.left.right.left=new Node(7);
        root.left.right.right=new Node(4);
        root.right.left=new Node(0);
        root.right.right=new Node(8);

        HashMap<Node,Node> map;
        map=storeParent(root);
        ArrayList<Integer> list=func(root,map,5,2);
        System.out.println(list);


    }

    static HashMap<Node,Node> storeParent(Node root){
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);
        HashMap<Node,Node> map=new HashMap<>();
        while(!queue.isEmpty()){
            Node node=queue.poll();
            if(node==root){
                map.put(root,root);
            }
            if(node.left!=null){
                queue.add(node.left);
                if(!map.containsKey(node.left)){
                    map.put(node.left,node);
                }
            }
            if(node.right!=null) {
                queue.add(node.right);
                if (!map.containsKey(node.right)) {
                    map.put(node.right, node);
                }
            }
        }
        return map;
    }

    static ArrayList<Integer> func(Node root,HashMap<Node,Node> map,int tar,int k){
        Node target=findTarget(root,tar);
        Queue<Node> queue=new ArrayDeque<>();
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.add(target);
//        set.add(target.val);
        int distance=0;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Node node=queue.poll();
                set.add(node.val);
                if(map.get(node)!=null && !set.contains(map.get(node).val)){
                    queue.add(map.get(node));
                }
                if(node.left!=null && !set.contains(node.left.val)){
                    queue.add(node.left);
                }
                if(node.right!=null && !set.contains(node.right.val)){
                    queue.add(node.right);
                }

            }
            distance++;
            if(distance==k){
                while(!queue.isEmpty()){
                    list.add(queue.poll().val);
                }
            }
        }
        return list;

    }
    static Node findTarget(Node root,int target){
        if(root==null){
            return null;
        }
        if(root.val==target){
            return root;
        }
        Node left=findTarget(root.left,target);
        Node right=findTarget(root.right,target);

        if(left!=null && left.val==target){
            return left;
        }
        return right;
    }
}
