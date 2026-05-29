import java.util.Arrays;

public class list_to_array {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(33);
        list.insert(34);

        DLL.Node temp=list.head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr=new int[size];
        int i=0;
        temp= list.head;
        while(i<size){
            arr[i]=temp.data;
            i++;
            temp=temp.next;
        }
        System.out.println(Arrays.toString(arr));

//        Array to list

    }
}
