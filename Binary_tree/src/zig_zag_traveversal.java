import java.util.*;

public class zig_zag_traveversal {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        boolean flag=false;
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);
        List<List<Integer>> list=new ArrayList<>();

        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> temp=new LinkedList<>();
            for(int i=0;i<levelsize;i++) {
                Node node = queue.peek();
               if(flag){
                  temp.addFirst(node.val);
               }else{
                   temp.add(node.val);
               }

               if(node.left!=null){
                   queue.add(node.left);
               }
               if(node.right!=null){
                   queue.add(node.right);
               }
               queue.remove();
            }
            flag=!flag;
            list.add(temp);
        }
        System.out.println(list);
    }
}
