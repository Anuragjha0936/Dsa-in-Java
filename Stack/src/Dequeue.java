import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;


public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addLast(10);
        deque.push(20); // pushing the element onto the head of the queue
        deque.addLast(25);
        deque.addFirst(1);

        System.out.println(deque);

        deque.removeLast();
        deque.removeFirst();
        deque.remove(); // removing the head element from the queue
        System.out.println(deque);


    }
}
