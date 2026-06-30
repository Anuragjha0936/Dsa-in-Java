import java.util.*;

public class vertical_order_traversal {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        List<List<Integer>> list=new ArrayList<>();
        func(root,list);
        System.out.println(list);
    }
    static void func(Node root,List<List<Integer>> list){
        Node node=root;
        Queue<info> queue=new ArrayDeque<>();
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();

        queue.add(new info(node,0,0));

        while(!queue.isEmpty()){
            info n=queue.poll();

            if(n.node.left!=null){
                queue.add(new info(n.node.left,n.row+1,n.col-1));
            }
            if(n.node.right!=null){
                queue.add(new info(n.node.right,n.row+1,n.col+1));
            }

            if(!map.containsKey(n.col)){
                map.put(n.col,new TreeMap<>());
            }
            if(!map.get(n.col).containsKey(n.row)){
                map.get(n.col).put(n.row,new PriorityQueue<>());
            }
            map.get(n.col).get(n.row).offer(n.node.val);

        }
        System.out.println(map);

        for(TreeMap<Integer,PriorityQueue<Integer>> m:map.values()){
            List<Integer> list1=new ArrayList<>();
            for(PriorityQueue<Integer> pq:m.values()){
                while(!pq.isEmpty()){
                    list1.add(pq.poll());
                }
            }
            list.add(list1);
        }


    }
    static class info{
        Node node;
        int row;
        int col;
        info(Node node,int row,int col){
            this.node=node;
            this.row=row;
            this.col=col;
        }
    }
}
