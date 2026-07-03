import java.util.*;

public class min_time_burnBT {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        HashMap<Node,Node> map;
        map=storeParent(root);
        System.out.println(func(root,map,2));
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

    static int func(Node root, HashMap<Node,Node> map, int tar){
        Node target=findTarget(root,tar);
        Queue<Node> queue=new ArrayDeque<>();
        HashSet<Node> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.add(target);
//        set.add(target.val);
        int distance=0;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Node node=queue.poll();
                set.add(node);
                if(map.get(node)!=null && !set.contains(map.get(node))){
                    queue.add(map.get(node));
                }
                if(node.left!=null && !set.contains(node.left)){
                    queue.add(node.left);
                }
                if(node.right!=null && !set.contains(node.right)){
                    queue.add(node.right);
                }

            }
            distance++;

        }
        return distance-1;

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
