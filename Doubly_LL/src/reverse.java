public class Main {
    public static void main(String[] args) {
       DLL list=new DLL();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.insert(4);

//       list.display();
//        Stack<Integer> stack=new Stack<>();
//        DLL.Node temp=list.head;
//        while(temp!=null){
//            stack.push(temp.data);
//            temp=temp.next;
//        }
//        temp= list.head;
//        while(temp!=null){
//            temp.data=stack.pop();
//            temp=temp.next;
//        }
        list.display();

//       Optimal approach
        DLL.Node current= list.head;
        DLL.Node last=null;
        while(current!=null){
            last=current.prev;
            current.prev=current.next;
            current.next=last;
            current=current.prev;
        }
        list.head=last.prev;
        list.display();
    }
}