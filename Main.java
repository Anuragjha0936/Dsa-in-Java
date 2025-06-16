public class Main {
    public static void main(String[] args) {
        LL linked=new LL();
//        linked.insertfirst(8);
//        linked.insertfirst(1);
//        linked.insertfirst(9);
//        linked.insertfirst(10);

        //linked.display();

        linked.insertlast(45);
//        linked.insertlast(9);
//        linked.insertlast(27);
//        linked.insertlast(7);

//        linked.insert(43,2);
//        linked.display();
//        linked.deletefirst();
        System.out.println( linked.deletelast());
        linked.display();

    }
}
