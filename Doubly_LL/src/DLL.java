public class DLL {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    // Insert at last
    public void insert(int data) {

        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Display list
    public void display() {

        Node temp = head;

        while (temp != null) {
            if(temp.next==null){
                System.out.print(temp.data+"->");
            }else {
                System.out.print(temp.data + " <-> ");
            }
            temp = temp.next;
        }

        System.out.println("null");
    }

}
