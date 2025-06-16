public class reversell {
    public static void main(String[] args) {
        LL1 list=new LL1();
        for(int i=2;i<7;i++){
            list.insertlast(i);
        }
        list.display();
        System.out.println(list.head.value);
        System.out.println(list.tail.value);
        list.reverse(list.head);
        list.display();
    }

}
